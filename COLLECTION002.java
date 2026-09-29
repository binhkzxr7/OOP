//Nha kho nang cao
import java.util.*;

class Warehouse {
    private Map<String, Integer> inventory;

    public Warehouse() {
        inventory = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        inventory.put(product, stock);
    }

    public int price(String product) {
        return -99;
    }

    public int stock(String product) {
        if(inventory.containsKey(product)) {
            return inventory.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if(inventory.containsKey(product) && inventory.get(product) > 0) {
            inventory.put(product, inventory.get(product) - 1);
            return true;
        }
        return false;
    }
}
public class COLLECTION002 {
    public static void main(String[] arrgs) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 1);
        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));
        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
