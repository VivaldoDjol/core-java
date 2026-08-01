import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer in = new StreamTokenizer(br);
        StringBuilder sb = new StringBuilder();

        in.nextToken(); 
        int tests = (int) in.nval;
        
        while (tests-- > 0) {
            in.nextToken();
            int n = (int) in.nval;
            
            in.nextToken();
            long p = (long) in.nval;

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                in.nextToken();
                a[i] = (int) in.nval;
            }

            long[] key = new long[n];
            for (int i = 0; i < n; i++) {
                in.nextToken();
                long bi = (long) in.nval;
                key[i] = (bi << 20) | a[i];
            }
            Arrays.sort(key);

            long remaining = n - 1;
            long cost = 0, used = 0;
            for (int i = 0; i < n; i++) {
                long bi = key[i] >> 20;
                long ai = key[i] & ((1 << 20) - 1);
                if (bi >= p || remaining == 0) break;
                long take = Math.min(ai, remaining);
                cost += take * bi;
                remaining -= take;
                used += take;
            }
            long k = n - used;
            sb.append(k * p + cost).append('\n');
        }
        System.out.print(sb);
    }
}
