import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String word = br.readLine();
            char[] letters = word.toCharArray();

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (letters[i] == '@') {
                    count++;
                } else if (letters[i] == '*' && i != n - 1) {
                    if (letters[i + 1] == '*') {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
