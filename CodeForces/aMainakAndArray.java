import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
            
            if (n == 1) {
                sb.append(0).append('\n');
                continue;
            }
            
            int ans = a[n-1] - a[0];
            
            int minLeft = a[0];
            for (int i = 0; i < n-1; i++) minLeft = Math.min(minLeft, a[i]);
            ans = Math.max(ans, a[n-1] - minLeft);
            
            int maxRight = a[n-1];
            for (int i = 1; i < n; i++) maxRight = Math.max(maxRight, a[i]);
            ans = Math.max(ans, maxRight - a[0]);
            
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, a[(j - 1 + n) % n] - a[j]);
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}