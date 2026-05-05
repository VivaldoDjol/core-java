import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();
        
        Map<String, Integer> freq = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            String twoGram = s.substring(i, i + 2);
            freq.put(twoGram, freq.getOrDefault(twoGram, 0) + 1);
        }
        
        String best = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                best = entry.getKey();
            }
        }
        System.out.println(best);
    }
}
