import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int onesInS = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') onesInS++;
            }

            int totalOnes = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    totalOnes += (onesInS - 1);
                } else {
                    totalOnes += (onesInS + 1);
                }
            }
            System.out.println(totalOnes);
        }
        sc.close();
    }
}
