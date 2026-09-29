//Tìm chữ cái ở vị trí index nhất định
import java.util.*;
public class STRING001 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            int index = sc.nextInt();
            char result = s.charAt(index);
            System.out.println("The character at position " + index + " is " + result);
        }
        sc.close();
    }
}
