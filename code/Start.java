class Start {
    public static void main(String[] data) {
        Student st = new Student("Harry P", 92.7);
        System.out.println(st);
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

enum Gender { MALE, FEMALE }
enum ProductType { Phone, Tablet, Laptop }
enum Direction { North, East, South, West }

record Student(String name, double score) { }