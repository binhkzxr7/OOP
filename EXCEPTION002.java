//Kiem tra diem
import java.util.*;

class NotJavaFileException extends Exception {
    public NotJavaFileException(String message) {
        super(message);
    }
}

public class EXCEPTION002 {
    public static int checkFileExtension(String fileName) throws NotJavaFileException {
        if(fileName == null || fileName.isEmpty()) {
            throw new NotJavaFileException ("Not java file exception.Mark is -1");
        }
        if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String fileName = sc.nextLine();
            try {
                int score = checkFileExtension(fileName);
                System.out.println(score);
            } catch (NotJavaFileException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
