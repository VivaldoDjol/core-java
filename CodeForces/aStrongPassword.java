import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();

        while (tests-- > 0) {
            String s = br.readLine();
            char[] arr = s.toCharArray();
            StringBuilder result = new StringBuilder();
            boolean inserted = false;

            for (int i = 0; i < arr.length - 1; i++) {
                result.append(arr[i]);
                if (!inserted && arr[i] == arr[i + 1]) {
                    char newChar = (arr[i] == 'a') ? 'b' : 'a';
                    result.append(newChar);
                    inserted = true;
                }
            }

            result.append(arr[arr.length - 1]);

            if (!inserted) {
                char newChar = (arr[0] == 'a') ? 'b' : 'a';
                result.insert(0, newChar);
            }
            out.append(result).append("\n");
        }
        System.out.print(out);
    }
}
