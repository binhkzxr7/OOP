//May dien thoai
import java.util.*;

interface Callable {
    String call();
}

interface Browsable {
    String browse();
}

class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public String call() {
        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {
            if (number.matches("\\d+")) {
                sb.append("Calling... ").append(number).append("\n");
            } else {
                sb.append("Invalid number!").append("\n");
            }
        }
        return sb.toString().trim();
    }

    public String browse() {
        StringBuilder sb = new StringBuilder();
        for (String url : urls) {
            if (url.matches(".*\\d.*")) {
                sb.append("Invalid URL!\n");
            } else {
                sb.append("Browsing: ").append(url).append("!\n");
            }
        }
        return sb.toString().trim();
    }
}
public class INTERFACE016 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            sc.nextLine();
            while(t-->0) {
                String[] numbers = sc.nextLine().split("\\s+");
                String[] urls = sc.nextLine().split("\\s+");
                Smartphone smartphone = new Smartphone(Arrays.asList(numbers), Arrays.asList(urls));
                System.out.println(smartphone.call());
                System.out.println(smartphone.browse());
            }
        }
        sc.close();
    }
}
