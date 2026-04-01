// Song comparison
import java.util.*;
class Song {
    private String name;
    private String author;
    private int duration;

    public Song(String name, String author, int duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Song)) {
            return false;
        }
        Song s = (Song) o;
        return this.name.equals(s.name) && this.author.equals(s.author) && this.duration == s.duration;
    }
}
public class OBJECT_REFERENCES002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String name1 = sc.next();
            String author1 = sc.next();
            int duration1 = sc.nextInt();

            String name2 = sc.next();
            String author2 = sc.next();
            int duration2 = sc.nextInt();

            Song s1 = new Song(name1, author1, duration1);
            Song s2 = new Song(name2, author2, duration2);
            System.out.println(s1.equals(s2));
        }
        sc.close();
    }
}
