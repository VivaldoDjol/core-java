import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int total = a + b + c;
            int cycles = (n - 1) / total;
            int rem = n - cycles * total;
            int day;

            if (rem <= a) {
                day = cycles * 3 + 1;
            } else if (rem <= a + b) {
                day = cycles * 3 + 2;
            } else {
                day = cycles * 3 + 3;
            }
            System.out.println(day);
        }
        sc.close();
    }
}
