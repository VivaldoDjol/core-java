import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();

        if (s == 0 && m > 1 || s > 9 * m) {
            System.out.println("-1 -1");
            return;
        }

        if (s == 0 && m == 1) {
            System.out.println("0 0");
            return;
        }

        StringBuilder smallest = new StringBuilder();
        int remaining = s;
        for (int i = 0; i < m; i++) {
            for (int d = (i == 0 ? 1 : 0); d <= 9; d++) {
                if (remaining - d <= 9 * (m - i - 1)) {
                    smallest.append(d);
                    remaining -= d;
                    break;
                }
            }
        }

        StringBuilder largest = new StringBuilder();
        remaining = s;
        for (int i = 0; i < m; i++) {
            for (int d = 9; d >= 0; d--) {
                if (remaining - d >= 0 && remaining - d <= 9 * (m - i - 1)) {
                    largest.append(d);
                    remaining -= d;
                    break;
                }
            }
        }
        System.out.println(smallest + " " + largest);
    }
}
