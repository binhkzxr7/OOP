//Quản lí nhân viên
import java.util.*;
class Employee
{
    private String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getInfo()
    {
        return "Name: " + name + " Salary: " + salary;
    }

    public double calculateSalary()
    {
        return this.salary;
    }
}

class FullTimeEmployee extends Employee{
    private double bonus;
    public FullTimeEmployee(String name, double salary, double bonus)
    {
        super(name, salary);
        this.bonus = bonus;
    }
    public double calculateSalary()
    {
        return super.calculateSalary() + this.bonus;
    }
    public String getInfo(){
        return String.format(
            "Loại: FullTime\n" +
            "Họ tên: %s\n" +
            "Lương cơ bản: %.1f\n" +
            "Thưởng: %.1f\n" +
            "=> Lương thực nhận: %.1f",
            super.getName(), super.getSalary(), this.bonus, this.calculateSalary()
        );
    }
}

class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, double salary, int hoursWorked, double hourlyRate){
        super(name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(){
        return this.hoursWorked * this.hourlyRate;
    }

    public String getInfo(){
        return String.format(
            "Loại: PartTime\n" +
            "Họ tên: %s\n" +
            "Số giờ làm việc: %d giờ\n" +
            "Tiền công mỗi giờ: %.1f\n" +
            "=> Lương thực nhận: %.1f",
            super.getName(), this.hoursWorked, this.hourlyRate, this.calculateSalary()
        );
    }
}

public class INHERITANCE012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Thông tin nhân viên ---");

        for (int i=0; i<2; i++){
            String type = sc.nextLine();
            Employee emp = null;

            if (type.equals("FullTime")) {
                String name = sc.nextLine();
                double salary = Double.parseDouble(sc.nextLine());
                double bonus = Double.parseDouble(sc.nextLine());
                emp = new FullTimeEmployee(name, salary, bonus);
            } else if (type.equals("PartTime")) {
                String name = sc.nextLine();
                int hoursWorked = Integer.parseInt(sc.nextLine());
                double hourlyRate = Double.parseDouble(sc.nextLine());
                emp = new PartTimeEmployee(name, 0, hoursWorked, hourlyRate);
            }

            if (emp != null) {
                System.out.println(emp.getInfo());
            }

            if (i == 0) {
                System.out.println();
            }
        }
        sc.close();
    }
}