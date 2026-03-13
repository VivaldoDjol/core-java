import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next();
        String target = sc.next();

        int startCol = start.charAt(0) - 'a' + 1;
        int startRow = start.charAt(1) - '0';
        int targetCol = target.charAt(0) - 'a' + 1;
        int targetRow = target.charAt(1) - '0';

        int colDiff = targetCol - startCol;
        int rowDiff = targetRow - startRow;

        StringBuilder moves = new StringBuilder();
        int moveCount = 0;

        while (colDiff != 0 || rowDiff != 0) {
            String move = "";
            if (colDiff < 0) {
                move += "L";
                colDiff++;
            } else if (colDiff > 0) {
                move += "R";
                colDiff--;
            }
            if (rowDiff < 0) {
                move += "D";
                rowDiff++;
            } else if (rowDiff > 0) {
                move += "U";
                rowDiff--;
            }
            moves.append(move).append("\n");
            moveCount++;
        }
        System.out.println(moveCount);
        System.out.print(moves);
        sc.close();
    }
}
