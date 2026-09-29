//Sử dụng StringBuffer để lấy chiều dài chuỗi
import java.util.*;
public class STRING004 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.next();
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.length());
        }
        sc.close();
    }
}
