// Chữ cái đầu tiên
import java.util.*;
public class STRING006 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        for (int i=0; i<t; i++) {
            String line = sc.nextLine();
            String res = "";
            for (int j=0; j<line.length();j++) {
                char c = line.charAt(j);
                if (Character.isUpperCase(c)) {
                    res += c;
                }
            }
            System.out.println("My initials are: " + res);
        }
        sc.close();
    }
}
