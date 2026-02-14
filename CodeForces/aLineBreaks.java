import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                String word = sc.next();
                if (count == i && sum + word.length() <= m) {
                    sum += word.length();
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}