import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n >= k && (n % 2) == (k % 2)) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) System.out.print("1 ");
                System.out.println(n - k + 1);
            } else if (n >= 2 * k && n % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++) System.out.print("2 ");
                System.out.println(n - 2 * k + 2);
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
