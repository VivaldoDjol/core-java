import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int twentyFive = 0;
        int fifty = 0;
        boolean possible = true;
        
        for (int i = 0; i < n; i++) {
            int bill = Integer.parseInt(st.nextToken());
            
            if (bill == 25) {
                twentyFive++;
            } else if (bill == 50) {
                if (twentyFive == 0) { possible = false; break; }
                twentyFive--;
                fifty++;
            } else {
                if (fifty > 0 && twentyFive > 0) {
                    fifty--;
                    twentyFive--;
                } else if (twentyFive >= 3) {
                    twentyFive -= 3;
                } else {
                    possible = false; break;
                }
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
