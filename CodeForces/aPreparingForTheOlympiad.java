import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(br.readLine().trim());

        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arrMono = new int[n];
            int[] arrStereo = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arrMono[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arrStereo[i] = Integer.parseInt(st.nextToken());
            }

            if (n == 1) {
                System.out.println(arrMono[0]);
                continue;
            }

            int total = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (i < n - 1 && arrMono[i] > arrStereo[i + 1]) {
                    total += arrMono[i] - arrStereo[i + 1];
                } else if (i < n - 1 && arrMono[i] < arrStereo[i + 1]) {
                    count++;
                }
                if (i == n - 1) {
                    total += arrMono[i];
                }
            }

            if (count == n) {
                System.out.println(arrMono[n - 1]);
            } else {
                System.out.println(total);
            }
        }
    }
}
