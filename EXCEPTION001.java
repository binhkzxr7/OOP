//Kiem tra tien te
import java.util.*;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public int add(Amount other) throws Exception {
        if (!this.currency.equals(other.currency)) {
            throw new Exception("Currency doesn't match");
        }
        return this.amount + other.amount;
    }
}
public class EXCEPTION001 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String currency1 = sc.next();
            int amount1 = sc.nextInt();
            Amount a1 = new Amount(currency1, amount1);

            String currency2 = sc.next();
            int amount2 = sc.nextInt();
            Amount a2 = new Amount(currency2, amount2);

            try {
                int total = a1.add(a2);
                System.out.println(total);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
