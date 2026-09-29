//Quan li kho nang cao (2)
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
        }
        return 0;
    }

    public boolean take(String product) {
        if(inventory.containsKey(product) && inventory.get(product) > 0) {
            inventory.put(product, inventory.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return inventory.keySet();
    }
}

public class COLLECTION003 {
    public static void main(String[] arrgs) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 2);
        warehouse.addProduct("yogurt", 2, 20);

        warehouse.take("buttermilk");
        warehouse.take("milk");
        warehouse.take("buttermilk");

        for (String product: warehouse.products()) {
            if (warehouse.stock(product) > 0) {
                System.out.println(product);
            }
        }
    }    
}
