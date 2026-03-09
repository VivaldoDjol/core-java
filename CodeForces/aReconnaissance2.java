import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;
        int idx1 = 1;
        int idx2 = 2;

        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            int diff = Math.abs(a[i] - a[j]);
            if (diff < minDiff) {
                minDiff = diff;
                idx1 = i + 1;
                idx2 = j + 1;
            }
        }
        System.out.println(idx1 + " " + idx2);
        sc.close();
    }
}