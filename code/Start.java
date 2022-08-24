import java.util.Arrays;
import java.util.Comparator;

class Start {
    public static void main(String[] data) {
        City[] all = {
                new City("Pattaya",       5000),
                new City("Banglamung",    2000),
                new City("Lamchabang",    3000),
                new City("Sriracha",      4000),
        };
        
        // Write code to sort by population
        Arrays.sort(all, new CityComparator());
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].population());
        }
    }
}

class CityComparator implements Comparator {
    @Override
    public int compare(Object x, Object y) {
        City p = (City)x;
        City q = (City)y;
        return p.population() - q.population();
    }
}

record City(String name, int population) {  }

interface Taxable { }

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