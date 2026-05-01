import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            int countEven = 0;
            int countOdd = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] % 2 == 0){
                    countEven++;
                } else{
                    countOdd++;
                }
            }

            if(n <= 1){
                System.out.println(arr[0]);
            } else {
                if(countEven >= 1 && countOdd >= 1){
                    Arrays.sort(arr);
                    System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", "").trim());
                } else {
                    System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", "").trim());
                }
            }
        }
    }
}
