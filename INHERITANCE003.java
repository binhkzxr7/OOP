// Con người
class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return name + " - " + address;
    }
}

class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study() {
        credits++;
    }

    public int getCredits() {
        return credits;
    }
}

public class INHERITANCE003 {
    public static void main(String[] args) {
        Student s = new Student(
            "Ollie",
            "6381 Hollywood Blvd. Los Angeles 90028"
        );

        System.out.println(s.toString());
        System.out.println("Study credits " + s.getCredits());
        s.study();
        System.out.println("Study credits " + s.getCredits());
    }    
}
