class Start {
    public static void main(String[] data) {
        Printer p = new Printer();
        p.start();
        
        Worker w = new Worker();
        Thread t = new Thread(w);
        t.start();
        
        for (int i = 0; i < 1000; i++) {
            System.out.print("A");
        }
    }
}

class Printer extends Thread {
    @Override public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("P");
        }
    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("W");
        }
    }
}

class Product {
    
    double price;
    double getSpecialPrice() {
        return price * 0.90;
    }
}
class Book extends Product { }
//     '              '-------------> super type or super class
//     '----------------------------> sub type or sub class

// Write method to discount 20% for member
class Shirt extends Product {
    Member m = new Member();
    
    @Override
    double getSpecialPrice() {      // This method is override
        return price * 0.80;
    }
}

class Member extends Product {
    String name;
    boolean customer_status;  // true => membership  false => not membership
    
    static boolean isMember(Member m) {
        if (m.name != null) {
            return true;
        } else {
            return false;
        }
    }
}


enum Gender { MALE, FEMALE }
enum ProductType { Phone, Tablet, Laptop }
enum Direction { North, East, South, West }

record Student(String name, double score) { }