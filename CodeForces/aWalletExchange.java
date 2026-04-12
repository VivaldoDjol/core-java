import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (tests-- > 0) {
            StreamTokenizer in = null;
            String[] parts = br.readLine().trim().split("\\s+");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);
            sb.append(((a + b) % 2 == 0) ? "Bob" : "Alice").append('\n');
        }
        System.out.print(sb);
    }
}
