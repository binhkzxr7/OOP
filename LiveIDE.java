interface A {
    void m();
    void n(String msg);
}

class C implements A {
    @Override
    public void m() {
        System.out.println("Method m() of C");
    }

    @Override
    public void n(String msg) { 
        System.out.println("OOP23 " + msg);
    }
}

class D extends C {
    boolean d = true; 
}

public class LiveIDE {
    public static void main(String[] args) {
        D obj = new D(); 
        
        obj.m();         
        obj.n("OOP23");  
        System.out.println(obj.d);
    }
}