import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            boolean found = false;
            for (int j = 0; j * 2021 <= n; j++) {
                int rem = n - j * 2021;
                if (rem % 2020 == 0) {
                    found = true;
                    break;
                }
            }
            sb.append(found ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}