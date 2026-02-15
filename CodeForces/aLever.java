import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int sumPos = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    sumPos += a[i] - b[i];
                }
            }
            System.out.println(sumPos + 1);
        }
        sc.close();
    }
}