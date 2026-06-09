import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            long n = Long.parseLong(br.readLine());
            System.out.println(n);
        }
    }
}
