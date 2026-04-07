import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st2.nextToken());
            }
            
            long total = 0;
            int i = 0;
            while (i < n) {
                if (arr[i] == 0) {
                    int start = i;
                    while (i < n && arr[i] == 0) i++;
                    int runLength = i - start;
                    total += (runLength + 1) / (k + 1);
                } else {
                    i++;
                }
            }
            sb.append(total).append('\n');
        }
        System.out.print(sb);
    }
}
