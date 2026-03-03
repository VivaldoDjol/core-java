import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String m = sc.next();
            int len = m.length();
            long round = 1;
            for (int i = 0; i < len - 1; i++) {
                round *= 10;
            }
            long original = Long.parseLong(m);
            System.out.println(original - round);
        }
        sc.close();
    }
}
