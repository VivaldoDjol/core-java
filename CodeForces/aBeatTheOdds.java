import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int odd = 0, even = 0;
            
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                
                if ((a & 1) == 0) even++;
                else odd++;
            }
            sb.append(n - Math.max(odd, even)).append('\n');
        }
        System.out.print(sb);
    }
}
