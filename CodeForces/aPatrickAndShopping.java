import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstDist = Integer.parseInt(st.nextToken());
        int secondDist = Integer.parseInt(st.nextToken());
        int thirdDist = Integer.parseInt(st.nextToken());

        int greedyRoute = firstDist + secondDist + thirdDist;
        int efficientRoute = (2 * firstDist) + (2 * secondDist);
        int firstRoute = 2 * firstDist + 2 * thirdDist;
        int secondRoute = 2 * secondDist + 2 * thirdDist;

        System.out.println(Math.min(Math.min(greedyRoute, efficientRoute), Math.min(firstRoute, secondRoute)));
    }
}
