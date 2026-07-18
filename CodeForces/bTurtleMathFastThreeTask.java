import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long sum = 0;
            int count1 = 0, count2 = 0;
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                sum += val;
                int mod = val % 3;
                if (mod == 1) count1++;
                else if (mod == 2) count2++;
            }

            long r = sum % 3;
            int ans;

            if (r == 0) {
                ans = 0;
            } else if (r == 1) {
                ans = 2;
                if (count1 >= 1) ans = Math.min(ans, 1);
                if (count2 >= 2) ans = Math.min(ans, 2);
            } else {
                ans = 1;
                if (count2 >= 1) ans = Math.min(ans, 1);
                if (count1 >= 2) ans = Math.min(ans, 2);
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}
