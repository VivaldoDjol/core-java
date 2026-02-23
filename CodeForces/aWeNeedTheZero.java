import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int totalXor = 0;
            for (int i = 0; i < n; i++) {
                totalXor ^= sc.nextInt();
            }
            if (n % 2 == 1) {
                System.out.println(totalXor);
            } else {
                System.out.println(totalXor == 0 ? 0 : -1);
            }
        }
        sc.close();
    }
}
