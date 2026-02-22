import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            int n = sc.nextInt();
            if (n == 2) {
                System.out.println(2);
            } else if (n == 3) {
                System.out.println(3);
            } else if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
        sc.close();
    }
}