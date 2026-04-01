// Viết chuỗi ra màn hình
import java.util.*;
public class BASIC001 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            System.out.println(s);
        }
        sc.close();
    }
}
