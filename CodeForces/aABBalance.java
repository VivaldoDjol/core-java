import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String s = sc.next();
            char first = s.charAt(0);
            char last = s.charAt(s.length() - 1);
            if (first == last) {
                System.out.println(s);
            } else {
                StringBuilder sb = new StringBuilder(s);
                sb.setCharAt(s.length() - 1, first);
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}
