import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (tests-- > 0) {
            String s = br.readLine().trim();
            char c = br.readLine().trim().charAt(0);
            
            boolean found = false;
            for (int i = 0; i < s.length(); i += 2) {
                if (s.charAt(i) == c) {
                    found = true;
                    break;
                }
            }
            sb.append(found ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}