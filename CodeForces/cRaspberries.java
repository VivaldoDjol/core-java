import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            if (k == 2 || k == 3 || k == 5) {
                int ans = k;
                for (int x : a) {
                    int rem = x % k;
                    int cost = rem == 0 ? 0 : k - rem;
                    ans = Math.min(ans, cost);
                }
                sb.append(ans).append('\n');
            } else if (k == 4) {
                int[] cost1 = new int[n];
                int[] cost2 = new int[n];
                for (int i = 0; i < n; i++) {
                    cost1[i] = a[i] % 2 == 0 ? 0 : 1;
                    int r4 = a[i] % 4;
                    cost2[i] = r4 == 0 ? 0 : 4 - r4;
                }
                int best = Integer.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    best = Math.min(best, cost2[i]);
                }
                Arrays.sort(cost1);
                best = Math.min(best, cost1[0] + cost1[1]);
                sb.append(best).append('\n');
            }
        }
        System.out.print(sb);
    }
}
