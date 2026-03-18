import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            if (x == 1 && (k == 1 || (k == 2 && n % 2 == 1))) {
                out.println("NO");
            } else {
                out.println("YES");
                if (x > 1) {
                    out.println(n);
                    for (int i = 0; i < n; i++) out.print((i > 0 ? " " : "") + 1);
                } else if (n % 2 == 0) {
                    int half = n / 2;
                    out.println(half);
                    for (int i = 0; i < half; i++) out.print((i > 0 ? " " : "") + 2);
                } else {
                    int half = (n - 1) / 2;
                    out.println(half);
                    for (int i = 0; i < half; i++) out.print((i > 0 ? " " : "") + (i == half - 1 ? 3 : 2));
                }
                out.println();
            }
        }
        out.flush();
    }
}
