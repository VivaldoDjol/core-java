import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            long n = Long.parseLong(br.readLine());
            long a = -1, b = -1, c;

            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    a = i;
                    break;
                }
            }

            if (a != -1) {
                long m = n / a;
                for (long i = 2; i * i <= m; i++) {
                    if (m % i == 0 && i != a) {
                        b = i;
                        break;
                    }
                }
                if (b != -1) {
                    c = m / b;
                    if (c <= 1 || c == a || c == b) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                        System.out.println(a + " " + b + " " + c);
                    }
                } else {
                    System.out.println("NO");
                }
            } else  {
                System.out.println("NO");
            }
        }
    }
}
