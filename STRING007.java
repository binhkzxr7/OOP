//Pangram
import java.util.*;
public class STRING007 {
    public static boolean isPangram(String s) {
        if (s.length() < 26) {
            return false;
        }
        s = s.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            System.out.println(isPangram(s));
        }
        sc.close();
    }
}
