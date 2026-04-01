// Grocery Store
import java.util.*;

class Item {
    private String name;
    private double price, discount;

    public Item(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() { return price; }
    public double getDiscount() { return discount; }

    public String toString() {
        return name + String.format(" $%.2f (-$%.2f)", price, discount);
    }
}

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public String getName() { return name; }
}

class GroceryBill {
    protected Employee clerk;
    protected ArrayList<Item> items = new ArrayList<>();
    protected double total = 0;

    public GroceryBill(Employee clerk) {
        this.clerk = clerk;
    }

    public void add(Item i) {
        items.add(i);
        total += i.getPrice();
    }

    public String toString() {
        String s = "items:\n";
        for (Item i : items) {
            s += "   " + i + "\n";
        }
        s += String.format("total: $%.2f\n", total);
        s += "Clerk: " + clerk.getName();
        return s;
    }
}

class DiscountBill extends GroceryBill {
    private double discount = 0;

    public DiscountBill(Employee clerk) {
        super(clerk);
    }

    public void add(Item i) {
        items.add(i);
        total += i.getPrice();
        discount += i.getDiscount();
    }

    public String toString() {
        String s = "items:\n";
        for (Item i : items) {
            s += "   " + i + "\n";
        }
        s += String.format("sub-total: $%.2f\n", total);
        s += String.format("discount: $%.2f\n", discount);
        s += String.format("total: $%.2f\n", total - discount);
        s += "Clerk: " + clerk.getName();
        return s;
    }
}

public class INHERITANCE009 {
    public static void main(String[] args) {
        GroceryBill g = new GroceryBill(new Employee("Grocery Bill"));
        g.add(new Item("item 1", 2.3, 0));
        g.add(new Item("item 2", 3.45, 0));

        System.out.println(g);
        System.out.println();

        DiscountBill d = new DiscountBill(new Employee("Discount Bill"));
        d.add(new Item("item 3", 20, 15));
        d.add(new Item("item 4", 40, 35));
        d.add(new Item("item 5", 50, 35));

        System.out.println(d);
    }
}