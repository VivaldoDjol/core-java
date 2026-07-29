import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long x = 1;
            while (n % x == 0) {
                x++;
            }
            sb.append(x - 1).append('\n');
        }
        System.out.print(sb);
    }
}
