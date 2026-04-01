import java.math.BigDecimal; 
import java.util.Scanner;    

public class BigDecimalExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\\s+");
            BigDecimal sum = BigDecimal.ZERO;
            for (String part : parts) {
                BigDecimal number = new BigDecimal(part);
                BigDecimal phanThapPhan = number.remainder(BigDecimal.ONE);
                sum = sum.add(phanThapPhan);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}