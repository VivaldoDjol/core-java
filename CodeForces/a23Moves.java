import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(2);
            } else {
                System.out.println((n + 2) / 3);
            }
        }
        sc.close();
    }
}
