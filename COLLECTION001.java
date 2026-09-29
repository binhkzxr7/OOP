//Nha kho
import java.util.*;

class Product {
    private int stock;
    private int price;

    public Product(int stock, int price) {
        this.stock = stock;
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }
}

class Warehouse {
    private Map<String, Product> inventory;

    public Warehouse() {
        inventory = new HashMap<>();
    }

    public void addProduct(String productName, int stock, int price) {
        Product product = new Product(stock, price);
        inventory.put(productName, product);
    }

    public int price(String productName) {
        if (inventory.containsKey(productName)) {
            return inventory.get(productName).getPrice();
        } else {
            return -99;
        }
    }
}
public class COLLECTION001 {
    public static void main(String[] arrgs) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 10, 3);
        warehouse.addProduct("coffee", 7, 5);
        System.out.println("prices:");
        System.out.println("milk: "+ warehouse.price("milk"));
        System.out.println("coffee: "+ warehouse.price("coffee"));
        System.out.println("sugar: "+ warehouse.price("sugar"));
    }
}
