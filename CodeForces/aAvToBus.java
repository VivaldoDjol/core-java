import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            long n = sc.nextLong();
            if (n % 2 != 0 || n == 2) {
                System.out.println(-1);
            } else {
                long m = n / 2;
                long b0 = m / 3;
                if ((b0 % 2) != (m % 2)) {
                    b0--;
                }
                long minBuses = (m - b0) / 2;
                long maxBuses = n / 4;
                System.out.println(minBuses + " " + maxBuses);
            }
        }
        sc.close();
    }
}