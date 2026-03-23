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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int n = 2 * Math.abs(a - b);

            if (a > n || b > n || c > n) {
                System.out.println(-1);
            } else {
                int d = n / 2 + c;
                d = ((d - 1) % n) + 1; //while(d > n) d -= n
                System.out.println(d);
            }
        }
        br.close();
    }
}
