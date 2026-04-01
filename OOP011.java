// Quản lý đơn hàng
import java.util.Scanner;
class Product
{
    String productID;
    String name;
    double price;

    public Product(String productID, String name, double price)
    {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    public void display()
    {
        System.out.println(name + " " + price);
    }
}

class Order
{
    String orderID;
    Product product;
    int quantity;

    public Order(String orderID, Product product, int quantity)
    {
        this.orderID = orderID;
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotal()
    {
        return product.price * quantity;
    }

    public void display()
    {
        System.out.println("--- Thông tin đơn hàng ---");
        System.out.println("Đơn hàng: "+ orderID);
        System.out.println("Sản phẩm: " + product.name + " (Mã: " + product.productID + ")");
        System.out.printf("Giá: %.1f\n", product.price);
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng tiền: %.1f\n", calculateTotal());

    }
}
public class OOP011 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String productID = sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        sc.nextLine();
        String orderID = sc.nextLine();
        int quantity = sc.nextInt();
        Order order = new Order (orderID, new Product(productID, name, price), quantity);
        order.display();
        sc.close();
    }
}
