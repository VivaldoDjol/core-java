import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                p[i] = sc.nextInt();
            }

            boolean found = false;
            for (int j = 2; j <= n - 1; j++) {
                if (p[j - 1] < p[j] && p[j] > p[j + 1]) {
                    System.out.println("YES");
                    System.out.println((j - 1) + " " + j + " " + (j + 1));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}