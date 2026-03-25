import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
      
        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int num = 0;

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st2.nextToken());
                if(i + 1 == f){
                    num = arr[i];
                }
            }
            Arrays.sort(arr, Comparator.reverseOrder());

            if (num > arr[k - 1]) {
                System.out.println("YES");
            } else if (num < arr[k - 1]) {
                System.out.println("NO");
            } else {
                if (k == n || arr[k] < num) {
                    System.out.println("YES");
                } else {
                    System.out.println("MAYBE");
                }
            }
        }
    }
}
