class Author {
    String name;
    String email;
    char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}
class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public void printDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author.name);
        System.out.println("Author Email: " + author.email);
        System.out.println("Author Gender: " + author.gender);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity in Stock: " + qtyInStock);
    }
}
public class EncapsulationEX {
public static void main(String[] args) {
Author harika = new Author("Loka Harika", "lokaharikagolla@gmail.com", 'F');
Book ABC_Book = new Book("ABC Book", harika , 1900, 50);
        ABC_Book.printDetails();
    }
}
