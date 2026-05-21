import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String word = br.readLine();
            LinkedHashSet<String> set = new LinkedHashSet<>();

            for (int i = 0; i < n - 1; i++) {
               set.add(word.substring(i, i + 2));
            }
            System.out.println(set.size());
        }
    }
}
