//Tim chuoi dai nhat
import java.util.*;
public class STRING005 {
    public static String findLongestWord(String sentence) {
        if(sentence == null || sentence.isEmpty()) {
            return "";
        }
        String[] words = sentence.trim().split("\\s+");
        String longestWord = "";
        int maxLength = 0;
        for (String word : words) {
            if(word.length() >= maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
        return longestWord;
    }

    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String sentence = sc.nextLine();
            System.out.println(findLongestWord(sentence));
        }
        sc.close();
    }
}
