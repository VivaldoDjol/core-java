import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            int i = 0;

            while (i < n) {
                char c = s.charAt(i);
                sb.append(c);
                i++;
                while (s.charAt(i) != c) i++;
                i++;
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
