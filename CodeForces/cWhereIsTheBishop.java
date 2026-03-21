import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for (int i = 1; i <= tests; i++) {
            char[][] g = new char[8][8];
            for (int r = 0; r < 8; r++) {
                String row = sc.next();
                for (int c = 0; c < 8; c++) {
                    g[r][c] = row.charAt(c);
                }
            }
            boolean found = false;
            for (int r = 1; r <= 6 && !found; r++) {
                for (int c = 1; c <= 6 && !found; c++) {
                    if (g[r][c] == '#' &&
                            g[r-1][c-1] == '#' &&
                            g[r-1][c+1] == '#' &&
                            g[r+1][c-1] == '#' &&
                            g[r+1][c+1] == '#') {
                        System.out.println((r + 1) + " " + (c + 1));
                        found = true;
                    }
                }
            }
        }
        sc.close();
    }
}
