import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tests = Integer.parseInt(st.nextToken());

        while (tests-- > 0) {
            while (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return;
                st = new StringTokenizer(line);
            }
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                grid[i] = br.readLine().trim().toCharArray();
            }

            String target = "vika";
            int charIdx = 0;

            for (int col = 0; col < m && charIdx < 4; col++) {
                for (int row = 0; row < n; row++) {
                    if (grid[row][col] == target.charAt(charIdx)) {
                        charIdx++;
                        break;
                    }
                }
            }
            System.out.println(charIdx == 4 ? "YES" : "NO");
        }
    }
}
