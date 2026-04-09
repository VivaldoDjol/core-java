import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            String n = br.readLine().trim();
            int len = n.length();

            if ((n.charAt(len - 1) - '0') % 2 == 0) {
                sb.append(0);
            } else if ((n.charAt(0) - '0') % 2 == 0) {
                sb.append(1);
            } else {
                boolean hasEven = false;
                for (int i = 1; i < len - 1; i++) {
                    if ((n.charAt(i) - '0') % 2 == 0) {
                        hasEven = true;
                        break;
                    }
                }
                sb.append(hasEven ? 2 : -1);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}