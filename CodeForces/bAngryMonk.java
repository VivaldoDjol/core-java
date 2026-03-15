import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            long n = sc.nextLong();
            int k = sc.nextInt();
            long mx = 0;
            for (int i = 0; i < k; i++) {
                long a = sc.nextLong();
                mx = Math.max(mx, a);
            }
            System.out.println(2 * (n - mx) - (k - 1));
        }
    }
}
