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
            int d = Integer.parseInt(st.nextToken());
            String s = br.readLine().trim();
            
            int insertPos = n; // default: append at end
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) - '0' < d) {
                    insertPos = i;
                    break;
                }
            }
            sb.append(s, 0, insertPos)
              .append(d)
              .append(s, insertPos, n)
              .append('\n');
        }
        System.out.print(sb);
    }
}
