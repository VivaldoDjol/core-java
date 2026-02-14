import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] a = new int[n];
            int max = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] > max) max = a[i];
            }

            if (max <= d) {
                System.out.println("YES");
            } else {
                int min1 = 101, min2 = 101;
                for (int val : a) {
                    if (val < min1) {
                        min2 = min1;
                        min1 = val;
                    } else if (val < min2) {
                        min2 = val;
                    }
                }
                if (min1 + min2 <= d) {
                   System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}