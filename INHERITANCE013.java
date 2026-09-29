//Quan li giang vien
import java.util.*;

class Teacher {
    protected String name;
    protected double baseSalary;

    public Teacher(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getInfo() {
        return name;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class PermanentLecturer extends Teacher {
    private double reseacherAllowance;

    public PermanentLecturer(String name, double baseSalary, double reseacherAllowance) {
        super(name, baseSalary);
        this.reseacherAllowance = reseacherAllowance;
    }

    public double calculateSalary() {
        return baseSalary + reseacherAllowance;
    }
}

class VisitingLecturer extends Teacher {
    private int teachingHours;
    private double paymentPerHour;

    public VisitingLecturer(String name, int teachingHours, double paymentPerHour) {
        super(name, 0);
        this.teachingHours =teachingHours;
        this.paymentPerHour = paymentPerHour;
    }

    public double calculateSalary() {
        return teachingHours * paymentPerHour;
    }
}

public class INHERITANCE013 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        Teacher[] teachers = new Teacher[2];
        for (int i=0; i<2; i++) {
            String type = sc.nextLine();
            String name = sc.nextLine();

            if (type.equals("PermanentLecturer")) {
                double baseSalary = Double.parseDouble(sc.nextLine());
                double allowance = Double.parseDouble(sc.nextLine());
                teachers[i] = new PermanentLecturer(name, baseSalary, allowance);
            } else {
                int hours = Integer.parseInt(sc.nextLine());
                double payment = Double.parseDouble(sc.nextLine());
                teachers[i] = new VisitingLecturer(name, hours, payment);
            }
        }
        System.out.println("--- Thông tin giảng viên ---");
        for (Teacher t : teachers) {
            if (t instanceof PermanentLecturer) {
                System.out.println("Loại giảng viên: Permanent");
            } else {
                System.out.println("Loại giảng viên: Visiting");
            }
            System.out.println("Họ tên: " + t.getName());
            System.out.println("Lương thực nhận: " + t.calculateSalary());
        }
        sc.close();
    }
}