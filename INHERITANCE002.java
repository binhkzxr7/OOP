// Chiếc hộp
import java.util.*;
class Item {
    private String name;
    private int weight;

    public Item (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return name;}
    public int getWeight() { return weight; }
}

abstract class Box {
    public abstract void add(Item item);
    public abstract boolean isInBox(Item item);
}

class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();
    private int totalWeight = 0;

    public BoxWithMaxWeight (int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add (Item item) {
        if (item.getWeight() + totalWeight <= maxWeight){
            items.add(item);
            totalWeight += item.getWeight();
        }
    }

    public boolean isInBox (Item item) {
        for (Item i: items) {
            if(i.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;
    }
}

public class INHERITANCE002 {
    public static void main (String[] args) {
        Box box = new BoxWithMaxWeight(10);
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));
        box.add(new Item("Kopi Luwak", 5));
        System.out.println(box.isInBox(new Item("Saludo", 0)));
        System.out.println(box.isInBox(new Item("Pirkka", 0)));
        System.out.println(box.isInBox(new Item("Kopi Luwak", 0)));
    }
}
