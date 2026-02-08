import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long total = 0;
            long maxBeauty = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                total += a;
                maxBeauty += (a + x - 1) / x;
            }
            long minBeauty = (total + x - 1) / x;
            System.out.println(minBeauty + " " + maxBeauty);
        }
        sc.close();
    }
}