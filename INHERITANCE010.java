//Thuong mai dien tu
import java.util.*;

abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void reduceQuantity(int amount) {
        quantity -= amount;
    }

    abstract public double calculateCost(int quantity);
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + quantity);
    }
}

class Book extends Product {
    private String author;

    public Book(String name, double price, int quantity, String author) {
        super(name, price, quantity);
        this.author = author;
    }

    public double calculateCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, int quantity, String brand) {
        super(name, price, quantity);
        this.brand = brand;
    }

    public double calculateCost(int quantity) {
        return price * quantity * 1.1;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
    }
}

class User {
    private String username;
    private double totalSpent;

    public User(String username) {
        this.username = username;
        this.totalSpent = 0;
    }

    public String getUsername() {
        return username;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void buyProduct(Product product, int quantity) {
        if (quantity <= product.getQuantity()) {
            double totalPrice = product.calculateCost(quantity);
            product.reduceQuantity(quantity);
            totalSpent += totalPrice;
            System.out.println("User: " + username + " bought " + quantity + " " + product.getName() + " for $" + totalPrice);
        } else {
            System.out.println("Insufficient quantity of " + product.getName() + " available.");
        }
    }
}

public class INHERITANCE010 {
    public static void main(String[] arrgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Electronics laptop = new Electronics ("laptop", 20, 10, "Dell");
            Book book = new Book("Harry Potter", 10, 12, "camnh");
            User alice = new User("Alice");
            User bob = new User("Bob");
            User charlie = new User("Charlie");

            alice.buyProduct(laptop, 3);
            alice.buyProduct(book, 10);
            bob.buyProduct(laptop, 1);
            charlie.buyProduct(book, 5);

            System.out.println("====");

            User[] users = {alice, bob, charlie};
            for (int i=0; i<users.length -1; i++) {
                for (int j=i+1; j<users.length; j++) {
                    if (users[j].getTotalSpent() > users[i].getTotalSpent()) {
                        User temp = users[i];
                        users[i] = users[j];
                        users[j] = temp;
                    }
                }
            }
            System.out.println("Users with Highest Total Spent:");
            for (int i=0; i<users.length; i++) {
                System.out.println((i+1) + ". " + users[i].getUsername() + ": $" + users[i].getTotalSpent());
            }
            System.out.println("====");
            laptop.displayDetails();
            System.out.println("---");
            book.displayDetails();
        }
        sc.close();
    }
}