//Xe co
import java.util.*;

class Vehicle {
    protected double price;

    public Vehicle (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return "Vehicle";
    }

    public double calculateTax() {
        return 1;
    }
}

class Car extends Vehicle {
    private int numberOfSeats;
    public Car(double price, int numberOfSeats) {
        super(price);
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return "Car";
    }

    public double calculateTax() {
        return price * 0.05;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}

class Truck extends Vehicle {
    private double loadCapacity;
    public Truck(double price, double loadCapacity) {
        super(price);
        this.loadCapacity = loadCapacity;
    }

    public String getType() {
        return "Truck";
    }

    public double calculateTax() {
        return price * 0.1 + loadCapacity * 1000;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}

public class INHERITANCE014 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Vehicle> vehicles = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String type = sc.next();
            double price = sc.nextDouble();
            if (type.equals("Car")) {
                int numberOfSeats = sc.nextInt();
                vehicles.add(new Car(price, numberOfSeats));
            } else {
                double loadCapacity = sc.nextDouble();
                vehicles.add(new Truck(price, loadCapacity));
            }
        }
        double totalTax = 0;
        System.out.println("Danh sách phương tiện và thuế:");
        for (Vehicle v : vehicles) {
            double tax = v.calculateTax();
            totalTax += tax;
            if (v instanceof Car) {
                Car car = (Car) v;
                System.out.printf("Car - Giá: %.2f, Số ghế: %d, Thuế: %.2f\n", car.getPrice(), car.getNumberOfSeats(), tax);
            } else {
                Truck truck = (Truck) v;
                System.out.printf("Truck - Giá: %.2f, Tải trọng: %.2f tấn, Thuế: %.2f\n", truck.getPrice(), truck.getLoadCapacity(), tax);
            }
        }
        System.out.printf("Tổng thuế phải đóng: %.2f\n", totalTax);
        sc.close();
    }
}