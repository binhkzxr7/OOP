//Nhac si
import java.util.*;

class Musician {
    private String name;
    private String nationality;
    private String style;

    public Musician(String name, String nationality, String style) {
        this.name = name;
        this.nationality = nationality;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String toString() {
        return "Musician[name=" + name + ", nationality=" + nationality + ", style=" + style + "]";
    }
}

class Song {
    private String title;
    private String genre;
    private int year;
    private Musician musician;

    public Song(String title, String genre, int year, Musician musician) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.musician = musician;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Song[title=" + title + ", genre=" + genre + ", year=" + year + ", " + musician + "]"; 
    }
}

public class OOP003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String nationality = sc.nextLine();
        String style = sc.nextLine();
        String title = sc.nextLine();
        String genre = sc.nextLine();
        int year = Integer.parseInt(sc.nextLine());

        if (!nationality.equals("VN") && !nationality.equals("INT")) {
            System.out.println("Invalid nationality. Only 'VN' or 'INT' allowed.");
            sc.close();
            return;
        }

        Musician m = new Musician(name, nationality, style);
        Song s = new Song(title, genre, year, m);
        System.out.println(s);
        sc.close();
    }
}