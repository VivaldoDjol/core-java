import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] names = new String[n];
        int[] points = new int[n];
        Map<String, Integer> total = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            names[i] = st.nextToken();
            points[i] = Integer.parseInt(st.nextToken());
            total.merge(names[i], points[i], Integer::sum);
        }

        int mx = Collections.max(total.values());

        Map<String, Integer> cur = new HashMap<>();
        for (int i = 0; i < n; i++) {
            cur.merge(names[i], points[i], Integer::sum);
            if (total.get(names[i]) == mx && cur.get(names[i]) >= mx) {
                System.out.println(names[i]);
                return;
            }
        }
    }
}
