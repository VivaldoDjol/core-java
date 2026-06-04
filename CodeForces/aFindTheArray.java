import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            int s = Integer.parseInt(br.readLine().trim());
            int k = (int) Math.ceil(Math.sqrt(s));
            sb.append(k).append('\n');
        }
        System.out.print(sb);
    }
}