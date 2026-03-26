import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            int n = 7;
            Integer[] arr = new Integer[n];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int a = arr[0];
            int b = arr[1];
            int c = arr[n-1] - (a + b);

            System.out.println(a + " " + b + " " + c);
        }
    }
}
