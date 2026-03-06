import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[n + 1];
            for (int i = 0; i < n; i++) {
                freq[sc.nextInt()]++;
            }
            int score = 0;
            for (int count : freq) {
                score += count / 2;
            }
            System.out.println(score);
        }
        sc.close();
    }
}
