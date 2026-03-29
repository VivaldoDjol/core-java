import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            List<Integer> pos = new ArrayList<>();
            
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] == 1) {
                    pos.add(j);
                }
            }
            if (pos.get(pos.size() - 1) - pos.get(0) + 1 > k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
