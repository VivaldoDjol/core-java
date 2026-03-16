import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tests = Integer.parseInt(br.readLine().trim());

        while (tests-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long sum = 0;

            while (n >= 1) {
                sum += n;
                n = n / 2;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
