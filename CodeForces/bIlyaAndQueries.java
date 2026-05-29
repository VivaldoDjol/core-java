import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();
        int len = str.length();

        int[] equalPairs = new int[len + 1];
        for (int i = 0; i < len - 1; i++) {
            equalPairs[i + 1] = equalPairs[i] + (str.charAt(i) == str.charAt(i + 1) ? 1 : 0);
        }
        equalPairs[len] = equalPairs[len - 1];

        int numQueries = Integer.parseInt(br.readLine().trim());
        StringBuilder output = new StringBuilder();

        for (int q = 0; q < numQueries; q++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            output.append(equalPairs[right - 1] - equalPairs[left - 1]).append('\n');
        }
        System.out.print(output);
    }
}
