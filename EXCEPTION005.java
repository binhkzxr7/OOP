//Rut tien ngan hang
import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Lỗi: Số tiền rút không được âm!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Lỗi: Số dư không đủ để rút " + amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EXCEPTION005 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            double balance = sc.nextDouble();
            BankAccount acc = new BankAccount(balance);
            
            while (sc.hasNext()) {
                String input = sc.next();
                try {
                    double amount = Double.parseDouble(input);
                    acc.withdraw(amount);
                    System.out.println("Rút tiền thành công! Số dư còn lại: " + acc.getBalance());
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Vui lòng nhập số hợp lệ!");
                } catch (IllegalArgumentException | InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        sc.close();
    }
}
