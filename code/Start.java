class Start {
    public static void main(String[] data) {
        Book b = new Book();
        b.price = 150;
        double t = b.getSpecialPrice();
        System.out.println(t);
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
    
    double getSpecialPrize() {
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