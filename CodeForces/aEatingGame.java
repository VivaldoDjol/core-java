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
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            Set<Integer> winners = new HashSet<>();
            
            for (int start = 0; start < n; start++) {
                int[] dishes = Arrays.copyOf(a, n);
                int current = start;
                int lastEater = -1;
                
                int total = 0;
                for (int x : dishes) total += x;
                
                int eaten = 0;
                while (eaten < total) {
                    if (dishes[current] > 0) {
                        dishes[current]--;
                        lastEater = current;
                        eaten++;
                    }
                    current = (current + 1) % n;
                }
                winners.add(lastEater);
            }
            sb.append(winners.size()).append("\n");
        }
        System.out.print(sb);
    }
}
