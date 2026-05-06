import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            b[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(b);
        
        int min = b[0], max = b[n - 1];
        long diff = (long)(max - min);
        long ways;
        
        if (diff == 0) {
            ways = (long) n * (n - 1) / 2;
        } else {
            long countMin = 0, countMax = 0;
            for (int x : b) {
                if (x == min) countMin++;
                else if (x == max) countMax++;
            }
            ways = countMin * countMax;
        }
        System.out.println(diff + " " + ways);
    }
}