import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int count = 0;
        long waste = 0;
        
        for (int i = 0; i < n; i++) {
            long a = Long.parseLong(st.nextToken());
            if (a <= b) {
                waste += a;
                if (waste > d) {
                    count++;
                    waste = 0;
                }
            }
        }
        System.out.println(count);
    }
}
