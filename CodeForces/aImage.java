import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (tests-- > 0) {
            String row1 = br.readLine().trim();
            String row2 = br.readLine().trim();

            Set<Character> distinct = new HashSet<>();
            distinct.add(row1.charAt(0));
            distinct.add(row1.charAt(1));
            distinct.add(row2.charAt(0));
            distinct.add(row2.charAt(1));

            sb.append(distinct.size() - 1).append('\n');
        }
        System.out.print(sb);
    }
}