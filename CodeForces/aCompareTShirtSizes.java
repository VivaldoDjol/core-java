import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-- > 0) {
            String a = sc.next();
            String b = sc.next();

            char typeA = a.charAt(a.length() - 1);
            char typeB = b.charAt(b.length() - 1);

            int priorityA = typeA == 'S' ? 0 : (typeA == 'M' ? 1 : 2);
            int priorityB = typeB == 'S' ? 0 : (typeB == 'M' ? 1 : 2);

            if (priorityA < priorityB) {
                System.out.println("<");
            } else if (priorityA > priorityB) {
                System.out.println(">");
            } else {
                if (typeA == 'M') {
                    System.out.println("=");
                } else if (typeA == 'S') {
                    int countA = a.length() - 1;
                    int countB = b.length() - 1;

                    if (countA > countB) System.out.println("<");
                    else if (countA < countB) System.out.println(">");
                    else System.out.println("=");
                } else {
                    int countA = a.length() - 1;
                    int countB = b.length() - 1;

                    if (countA > countB) System.out.println(">");
                    else if (countA < countB) System.out.println("<");
                    else System.out.println("=");
                }
            }
        }
        sc.close();
    }
}qqqq
