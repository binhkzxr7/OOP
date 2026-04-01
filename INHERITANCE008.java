// Tín chỉ
class Person {
    private String name;
    private String address;

    public Person (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return name + " - " + address;
    }
}

class Student extends Person {
    private int credits;

    public Student (String name, String address, int credits) {
        super(name, address);
        this.credits = credits;
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return credits;
    }
}
public class INHERITANCE008 {
    public static void main (String[] args) {
        Student s = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028", 0);
        System.out.println(s.toString());
        System.out.println("Study credits " + s.credits());
        s.study();
        System.out.println("Study credits " + s.credits());
    }
}
