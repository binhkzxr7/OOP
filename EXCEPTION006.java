//Nguyên âm
import java.util.*;

class NotContainVowelException extends Exception {
    public NotContainVowelException(String message) {
        super(message);
    }
}

public class EXCEPTION006 {
    public static void checkVowels(String s) throws NotContainVowelException {
        if (s.matches(".*[aeiouAEIOU].*")) {
            System.out.println("String has vowels");
        } else {
            throw new NotContainVowelException("String not contain vowels");
        }
    }

    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            try {
                checkVowels(s);
            } catch (NotContainVowelException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}