import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        List<Integer> aIndexes = new ArrayList<>();
        List<Integer> qIndexes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a') {
                aIndexes.add(i + 1);
            } else if (s.charAt(i) == 'Q' || s.charAt(i) == 'q') {
                qIndexes.add(i + 1);
            }
        }
        int qBefore;
        int qAfter;
        int total = 0;

        for (Integer aIndex : aIndexes) {
            qBefore = 0;
            for (Integer qIndex : qIndexes) {
                if (qIndex < aIndex) {
                    qBefore++;
                }
                if (qIndex > aIndex) {
                    break;
                }
            }
            qAfter = qIndexes.size() - qBefore;
            total += qBefore * qAfter;
        }
        System.out.println(total);
    }
}
