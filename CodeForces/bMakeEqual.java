import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            long[] arr = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
                sum += arr[i];
            }
            
            long target = sum / n;
            long running = 0;
            boolean ok = true;
            
            for (int k = 0; k < n; k++) {
                running += arr[k];
                if (running < (long)(k + 1) * target) {
                    ok = false;
                    break;
                }
            }
            sb.append(ok ? "YES" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}
