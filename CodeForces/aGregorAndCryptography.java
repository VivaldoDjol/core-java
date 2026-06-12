import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (tests-- > 0) {
            long p = Long.parseLong(br.readLine().trim());
            sb.append(2).append(' ').append(p - 1).append('\n');
        }
        System.out.print(sb);
    }
}
