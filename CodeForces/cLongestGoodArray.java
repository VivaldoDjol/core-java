import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long l = Long.parseLong(st.nextToken());
            long r = Long.parseLong(st.nextToken());
            long diff = r - l;

            long lo = 1, hi = 200000;
            long ans = 1;
            while (lo <= hi) {
                long mid = (lo + hi) / 2;
                long val = mid * (mid - 1) / 2;
                if (val <= diff) {
                    ans = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}
