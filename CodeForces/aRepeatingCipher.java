import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String t = br.readLine().trim();

        StringBuilder s = new StringBuilder();
        int i = 0, k = 1;
        while (i < n) {
            s.append(t.charAt(i));
            i += k;
            k++;
        }
        System.out.println(s);
    }
}
