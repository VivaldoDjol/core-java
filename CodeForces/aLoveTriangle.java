import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            f[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 1; i <= n; i++) {
            int a = f[i];
            int b = f[a];
            int c = f[b];
            if (c == i) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
        sc.close();
    }
}