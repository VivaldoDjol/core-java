import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine());

            if(n % 2 == 0){
                System.out.println((n/4) + 1);
            } else {
                System.out.println(0);
            }
        }
    }
}
