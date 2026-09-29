//Kiểm tra chuỗi có bằng chuỗi khác hay không
import java.util.*;
public class STRING003 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(s1.equalsIgnoreCase(s2));
        }
        sc.close();
    }
}
