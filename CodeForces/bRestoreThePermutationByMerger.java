import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[2 * n];

            for (int i = 0; i < 2 * n; i++) {
                arr[i] = sc.nextInt();
            }

            Set<Integer> uniqueElements = new LinkedHashSet<>();
            for (int x : arr) {
                uniqueElements.add(x);
            }

            for (int element : uniqueElements) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
