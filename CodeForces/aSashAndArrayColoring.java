import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(a);
            int cost = 0;
            for (int i = n / 2; i < n; i++)
                cost += a[i] - a[n - 1 - i];

            sb.append(cost).append('\n');
        }
        System.out.print(sb);
    }
}