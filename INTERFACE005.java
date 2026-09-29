//To chuc sinh nhat
import java.util.*;

interface Identifiable {
    String getId();
}

interface Birthable {
    String getBirthDate();
}

class Citizen implements Identifiable, Birthable {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }
}

class Pet implements Birthable {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() { return name;}
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }
}

public class INTERFACE005 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            List<Birthable> birthables = new ArrayList<>();
            while (true) {
                String type = sc.next();
                if(type.equals("End")) {
                    break;
                }
                if (type.equals("Citizen")) {
                    String name = sc.next();
                    int age = sc.nextInt();
                    String id = sc.next();
                    String birthDate = sc.next();
                    birthables.add(new Citizen(name, age, id, birthDate));
                }
                else if (type.equals("Pet")) {
                    String name = sc.next();
                    String birthDate = sc.next();
                    birthables.add(new Pet(name, birthDate));
                }
            }
            String year = sc.next();
            for (Birthable b : birthables) {
                if(b.getBirthDate().endsWith(year)) {
                    System.out.println(b.getBirthDate());
                }
            }
        }
        sc.close();
    }
}
