//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int tests = Integer.parseInt(br.readLine());
//
//        while (tests-- > 0) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int x = Integer.parseInt(st.nextToken());
//            int y = Integer.parseInt(st.nextToken());
//
//            double z = (double) x / 15;
//            int total = 0;
//            if (y > 0) {
//                while (y > 0) {
//                    total++;
//                    if (y >= 2) {
//                        x -= 7;
//                    } else {
//                        x -= 11;
//                    }
//                    y -= 2;
//                }
//                if (x > 0) {
//                    total += (int) Math.ceil((double) x / 15);
//                }
//                System.out.println(total);
//            } else {
//                if (x <= 15 && x != 0) {
//                    System.out.println(1);
//                } else if (x == 0) {
//                    System.out.println(0);
//                } else {
//                    int sum = (int) (Math.ceil(z));
//                    System.out.println(sum);
//                }
//            }
//        }
//    }
//}
import java.io.*;
        import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();

        while (tests-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // each screen fits 2 big icons, so we need ceil(y/2) screens for them
            int screens = (y + 1) / 2;

            // free cells for 1x1 icons on those screens:
            // full screens (2 big icons) have 7 free cells
            // a screen with 1 big icon has 11 free cells
            int free = screens * 7 + (y % 2 == 1 ? 4 : 0);

            x -= free;
            if (x > 0) {
                screens += (x + 14) / 15;
            }
            out.append(screens).append('\n');
        }
        System.out.print(out);
    }
}
