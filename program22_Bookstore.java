// File: Book.java
package bookstore.core;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    // Constructor
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
// File: InventoryManager.java
package bookstore.inventory;

import java.util.HashMap;
import java.util.Map;
import bookstore.core.Book;

public class InventoryManager {
    private Map<Book, Integer> inventory;

    // Constructor
    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    // Method to add book to inventory
    public void addBook(Book book, int quantity) {
        inventory.put(book, quantity);
    }

    // Method to update stock levels
    public void updateStock(Book book, int quantity) {
        if (inventory.containsKey(book)) {
            inventory.put(book, inventory.get(book) + quantity);
        } else {
            System.out.println("Book not found in inventory.");
        }
    }

    // Method to retrieve book details
    public void displayBookDetails(Book book) {
        if (inventory.containsKey(book)) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Quantity in stock: " + inventory.get(book));
        } else {
            System.out.println("Book not found in inventory.");
        }
    }
}
// File: Customer.java
package bookstore.users;

import java.util.ArrayList;
import java.util.List;
import bookstore.core.Book;

public class Customer {
    private String name;
    private String contactDetails;
    private List<Book> purchaseHistory;

    // Constructor
    public Customer(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
        this.purchaseHistory = new ArrayList<>();
    }

    // Method to add book to purchase history
    public void addToPurchaseHistory(Book book) {
        purchaseHistory.add(book);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<Book> getPurchaseHistory() {
        return purchaseHistory;
    }
}
