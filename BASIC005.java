// Tính tổng 5 số
import java.util.*;
public class BASIC005 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int sum = 0;
            for (int i=0; i<5; i++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
