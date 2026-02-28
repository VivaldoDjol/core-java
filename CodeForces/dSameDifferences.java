import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
      
        while (tests-- > 0) {
            int n = sc.nextInt();
            Map<Long, Long> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long val = sc.nextLong();
                long key = val - (i + 1);
                freq.put(key, freq.getOrDefault(key, 0L) + 1);
            }
            long ans = 0;
            for (long count : freq.values()) {
                ans += count * (count - 1) / 2;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
