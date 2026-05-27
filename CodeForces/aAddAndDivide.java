import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            int ans = Integer.MAX_VALUE;
            
            for (int inc = 0; inc <= 40; inc++) {
                long curB = b + inc;
                if (curB < 2) continue;
                int divs = 0;
                for (long curA = a; curA > 0; curA /= curB) divs++;
                ans = Math.min(ans, inc + divs);
            }
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}