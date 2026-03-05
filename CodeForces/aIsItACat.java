import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(s.toLowerCase().matches("m+e+o+w+") ? "YES" : "NO");
        }
        sc.close();
    }
}
