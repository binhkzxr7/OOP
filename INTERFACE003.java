// Taco Box
interface TacoBox {
    int tacoRemaining();
    void eat();
}

class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        tacos = 3;
    }

    public int tacoRemaining() {
        return tacos;
    }

    public void eat() {
        if (tacos >0) tacos--;
    }
}

class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public int tacoRemaining() {
        return tacos;
    }

    public void eat() {
        if (tacos >0) tacos--;
    }
}

public class INTERFACE003 {
    public static void main (String[] args) {
        TacoBox b1 = new TripleTacoBox();
        b1.eat();
        b1.eat();
        System.out.println("Triple taco boxes left: " + b1.tacoRemaining());
        TacoBox b2 = new CustomTacoBox(8);
        b2.eat();
        System.out.println("Custom taco boxes left: " + b2.tacoRemaining());
    }
}  
