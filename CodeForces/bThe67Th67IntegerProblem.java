import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = Integer.MIN_VALUE;
            int sum = 0;

            while (st.hasMoreTokens()) {
                int val = Integer.parseInt(st.nextToken());

                if (val > max) {
                    max = val;
                }
                sum += val * -1;
            }
            sum += 2 * max;
            System.out.println(sum);
        }
    }
}
