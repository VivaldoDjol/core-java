import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int qCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'Q' || s.charAt(i) == 'q') {
                qCount++;
            }
        }

        int total = 0;
        int qBefore = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'A' || c == 'a') {
                int qAfter = qCount - qBefore;
                total += qBefore * qAfter;
            } else if(c == 'Q' || c == 'q') {
                qBefore++;
            }
        }
        System.out.println(total);
    }
}
