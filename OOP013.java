//Quản lí sách
import java.util.*;
class Book
{
    private String bookID;
    private String title;
    private String author;
    
    public Book(String BookID, String title, String author)
    {
        this.bookID = BookID;
        this.title = title;
        this.author = author;
    }

    public void display()
    {
        System.out.println("Mã sách:" + bookID);
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Borrow
{
    private String borrowID;
    private Book book;
    private String borrower;
    private int days;

    public Borrow (String borrowID, Book book, String borrower, int days)
    {
        this.borrowID = borrowID;
        this.book = book;
        this.borrower = borrower;
        this.days = days;
    }

    public double calculateFee() {
        return days * 5000;
    }

    public void display() {
        System.out.println("--- Phiếu mượn sách ---");
        System.out.println("Mã phiếu: " + borrowID);
        System.out.println("Người mượn: " + borrower);
        System.out.println("Sách: " + book.getTitle() + " (Mã: " + book.getBookID() + ")" + " - " + book.getAuthor());
        System.out.println("Số ngày mượn: " + days);
        System.out.printf("Phí mượn: %.1f\n", calculateFee());
    }
}

public class OOP013 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String bookID = sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        String borrowID = sc.nextLine();
        String borrower = sc.nextLine();
        int days = sc.nextInt();
        Book b = new Book(bookID, title, author);
        Borrow br = new Borrow(borrowID, b, borrower, days);
        br.display();
        sc.close(); 
    }
}
