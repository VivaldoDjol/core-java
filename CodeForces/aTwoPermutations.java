import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        StringBuilder rest = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            rest.append(line).append(' ');
        }

        StringTokenizer st = new StringTokenizer(rest.toString());

        for (int i = 0; i < tests; i++) {
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            boolean ans;
            if (n == 1) {
                ans = (a == 1 && b == 1);
            } else if (a == n || b == n) {
                ans = (a == n && b == n);
            } else {
                ans = (a + b <= n - 2);
            }
            sb.append(ans ? "Yes" : "No").append('\n');
        }
        System.out.print(sb);
    }
}
