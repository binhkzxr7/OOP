// String Sposion
import java.util.*;
public class STRING009 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0) {
            String s = sc.next();
            String res = "";
            for (int i=0; i<s.length(); i++) {
                res += s.substring(0, i+1);
            }
            System.out.println(res);
        }
        sc.close();
    }
}
