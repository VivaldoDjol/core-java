import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        if ((n & 1) == 1) {
            System.out.println(0);
        } else {
            System.out.println(1L << (n / 2));
        }
    }
}
