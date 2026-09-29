//Thiet bi
import java.util.*;

class Device {
    protected double basePrice;

    public Device(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getType() {
        return "Device";
    }

    public double calculateWarrantyCost() {
        return basePrice;
    }
}

class Laptop extends Device {
    private int ramSize;

    public Laptop(double basePrice, int ramSize) {
        super(basePrice);
        this.ramSize = ramSize;
    }

    public String getType() {
        return "Laptop";
    }

    public int getRamSize() {
        return ramSize;
    }

    public double calculateWarrantyCost() {
        return basePrice * 0.07;
    }
}

class Smartphone extends Device {
    private double screenSize;

    public Smartphone(double basePrice, double screenSize) {
        super(basePrice);
        this.screenSize = screenSize;
    }

    public String getType() {
        return "Smartphone";
    }

    public double getScreenSize() {
        return screenSize;
    }

    public double calculateWarrantyCost() {
        return basePrice * 0.05 + screenSize * 50;
    }
}

public class INHERITANCE015 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Device> devices = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String type = sc.next();
            double basePrice = sc.nextDouble();
            if(type.equals("Laptop")) {
                int ramSize = sc.nextInt();
                devices.add(new Laptop(basePrice, ramSize));
            } else if(type.equals("Smartphone")) {
                double screenSize = sc.nextDouble();
                devices.add(new Smartphone(basePrice, screenSize));
            }
        }
        double totalWarrantyCost = 0;
        System.out.println("Danh sách thiết bị và chi phí bảo hành:");
        for (Device d : devices) {
            double warrantyCost = d.calculateWarrantyCost();
            totalWarrantyCost += warrantyCost;
            if (d instanceof Laptop) {
                Laptop l = (Laptop) d;
                System.out.printf("Laptop - Giá gốc: %.2f, Dung lượng RAM: %d GB, Chi phí bảo hành: %.2f\n", l.getBasePrice(), l.getRamSize(), warrantyCost);
            } else {
                Smartphone s = (Smartphone) d;
                System.out.printf("Smartphone - Giá gốc: %.2f, Kích thước màn hình: %.2f inch, Chi phí bảo hành: %.2f\n", s.getBasePrice(), s.getScreenSize(), warrantyCost);
            }
        }
        System.out.printf("Tổng chi phí bảo hành: %.2f\n", totalWarrantyCost);
        sc.close();
    }
}
