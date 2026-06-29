import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] count = new int[26];
            char[] result = new char[n];
            
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                for (int c = 0; c < 26; c++) {
                    if (count[c] == a) {
                        result[i] = (char)('a' + c);
                        count[c]++;
                        break;
                    }
                }
            }
            sb.append(new String(result)).append('\n');
        }
        System.out.print(sb);
    }
}
