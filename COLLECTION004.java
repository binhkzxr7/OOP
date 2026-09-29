//Quan li nha kho (3)
import java.util.*;

class Item {
    private String product;
    private int quantity;
    private int unitPrice;
    private int originalQuantity;

    public Item(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.originalQuantity = quantity;
    }

    public Item(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = 0;
        this.originalQuantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getOriginalQuantity() {
        return originalQuantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return quantity * unitPrice;
    }

    public void printItemInfo() {
        System.out.printf("Product: %s has quantity %d with price: %d\n", product, quantity, getTotalPrice());
    }
}

class Warehouse {
    private HashMap<String, Item> items;

    public Warehouse() {
        items = new HashMap<>();
    }

    public void importProduct(Item item) {
        items.put(item.getProduct(), item);
    }

    public Item getItem(String product) {
        return items.get(product);
    }

    public void removeProduct(String product, int quantity) {
        Item item = items.get(product);
        if(item != null) {
            item.setQuantity(item.getQuantity() - quantity);
        }
    }

    public void decreaseQuantityInWarehouseByOne() {
        for (Item item : items.values()) {
            item.setQuantity(item.getQuantity() - 1);
        }
    }

    public void takeFromItemToWarehouse(List<Item> itemsToCheck, String product, int quantity) {
        Item foundInList = null;
        for (Item item : itemsToCheck) {
            if (item.getProduct().equals(product)) {
                foundInList = item;
                break;
            }
        }
        if (foundInList != null) {
            Item warehouseItem = items.get(product);
            if(warehouseItem != null) {
                int availableInList = foundInList.getQuantity();
                int quantityToAdd = Math.min(quantity, availableInList);
                warehouseItem.setQuantity(warehouseItem.getQuantity() + quantityToAdd);
            }
        }
    }

    public void printWarehouseInfo() {
        for (Item item : items.values()) {
            item.printItemInfo();
        }
    }
}

public class COLLECTION004 {
    public static void main(String[] arrgs) {
        Item milk = new Item("milk", 4, 2);
        Item buttermilk = new Item("buttermilk", 10, 2);
        milk.printItemInfo();
        buttermilk.printItemInfo();

        Warehouse warehouse = new Warehouse();
        warehouse.importProduct(milk);
        warehouse.importProduct(buttermilk);

        warehouse.removeProduct("milk", 1);
        warehouse.removeProduct("buttermilk", 3);
        warehouse.getItem("milk").printItemInfo();
        warehouse.getItem("buttermilk").printItemInfo();

        warehouse.decreaseQuantityInWarehouseByOne();
        warehouse.getItem("milk").printItemInfo();
        warehouse.getItem("buttermilk").printItemInfo();

        List<Item> itemsToCheck = new ArrayList<>();
        itemsToCheck.add(new Item("milk", 2));
        itemsToCheck.add(new Item("buttermilk", 6));
        warehouse.takeFromItemToWarehouse(itemsToCheck, "milk", 5);
        warehouse.takeFromItemToWarehouse(itemsToCheck, "buttermilk", 1);
        warehouse.getItem("milk").printItemInfo();
        warehouse.getItem("buttermilk").printItemInfo();
    }
}
