import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] pages = new int[7];
        for (int i = 0; i < 7; i++) pages[i] = Integer.parseInt(st.nextToken());
        
        int total = 0;
        while (true) {
            for (int i = 0; i < 7; i++) {
                total += pages[i];
                if (total >= n) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
    }
}