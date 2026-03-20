import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine());

        while(tests-- > 0){
            int n = Integer.parseInt(br.readLine());
            int countZero = 0;
            int countOne = 0;
            int countTwo = 0;
            int countThree = 0;
            int countFive = 0;
            int idx = -1;

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < n; i++){
                int value = Integer.parseInt(st.nextToken());

                switch (value) {
                    case 0: countZero++; break;
                    case 1: countOne++; break;
                    case 2: countTwo++; break;
                    case 3: countThree++; break;
                    case 5: countFive++; break;
                }

                if (countZero >= 3 && countOne >= 1 && countTwo >= 2 && countThree >= 1 && countFive >= 1 && idx == -1) {
                    idx = i;
                }
            }
            System.out.println(idx == -1 ? 0 : idx + 1);
        }
    }
}
