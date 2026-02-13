import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String s = sc.next();
            int len = s.length();
            int start = (int) Math.pow(10, len - 1);
            int end = (int) Math.pow(10, len) - 1;
            int bestDiff = Integer.MAX_VALUE;
            int bestNum = -1;
            for (int cand = start; cand <= end; cand++) {
                if (cand % 7 == 0) {
                    String cs = String.valueOf(cand);
                    int diff = 0;
                    for (int i = 0; i < len; i++) {
                        if (s.charAt(i) != cs.charAt(i)) diff++;
                    }
                    if (diff < bestDiff) {
                        bestDiff = diff;
                        bestNum = cand;
                        if (bestDiff == 0) break;
                    }
                }
            }
            System.out.println(bestNum);
        }
        sc.close();
    }
}