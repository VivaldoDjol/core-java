import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        
        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                
                if (a - b > 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}