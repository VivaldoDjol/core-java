import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int odd = 0;
            int even = 0;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val % 2 == 1) odd++;
                else even++;
            }
            boolean possible = false;
            for (int k = 1; k <= odd && k <= x; k += 2) {
                if (x - k <= even) {
                    possible = true;
                    break;
                }
            }
            System.out.println(possible ? "Yes" : "No");
        }
        sc.close();
    }
}