import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            String s = br.readLine().trim();
            int n = s.length();
            int totalZeros = 0, totalOnes = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') totalZeros++;
                else totalOnes++;
            }

            int maxKeep = 0;
            int zerosInPrefix = 0, onesInPrefix = 0;
            for (int keep = 0; keep <= n; keep++) {
                if (totalOnes >= zerosInPrefix && totalZeros >= onesInPrefix) {
                    maxKeep = keep;
                }
                if (keep < n) {
                    if (s.charAt(keep) == '0') zerosInPrefix++;
                    else onesInPrefix++;
                }
            }
            sb.append(n - maxKeep).append('\n');
        }
        System.out.print(sb);
    }
}