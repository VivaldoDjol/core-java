import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] + sc.nextInt();
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            int left = 1, right = n;
            while (left < right) {
                int mid = (left + right) / 2;
                if (arr[mid] >= q) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(left);
        }
        sc.close();
    }
}
