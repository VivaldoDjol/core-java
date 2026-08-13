import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        
        if (x1 == x2) {
            int side = Math.abs(y2 - y1);
            System.out.println((x1 + side) + " " + y1 + " " + (x2 + side) + " " + y2);
        } else if (y1 == y2) {
            int side = Math.abs(x2 - x1);
            System.out.println(x1 + " " + (y1 + side) + " " + x2 + " " + (y2 + side));
        } else {
            if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
                System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
            } else {
                System.out.println(-1);
            }
        }
    }
}