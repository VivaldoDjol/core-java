import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            
            int p = 0;
            while (a % 2 == 0) {
                a /= 2;
                p++;
            }

            int q = 0;
            while (b % 2 == 0) {
                b /= 2;
                q++;
            }
            
            if (a != b) {
                sb.append(-1).append('\n');
            } else {
                int d = Math.abs(p - q);
                int ops = (d + 2) / 3;
                sb.append(ops).append('\n');
            }
        }
        System.out.print(sb);
    }
}