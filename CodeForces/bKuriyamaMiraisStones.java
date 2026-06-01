import java.io.InputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Main {
    
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() {
            if (head >= tail) {
                head = 0;
                try {
                    tail = in.read(buffer, 0, buffer.length);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public int nextInt() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            int res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res;
        }

        public long nextLong() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            long res = 0;
            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res;
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        
        int n = sc.nextInt();
        if (n == -1) return;
        
        long[] originalPrefixSum = new long[n + 1];
        long[] sortedCosts = new long[n];
        
        for (int i = 1; i <= n; i++) {
            long cost = sc.nextLong();
            originalPrefixSum[i] = originalPrefixSum[i - 1] + cost;
            sortedCosts[i - 1] = cost;
        }

        shuffle(sortedCosts);
        Arrays.sort(sortedCosts);
        
        long[] sortedPrefixSum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            sortedPrefixSum[i] = sortedPrefixSum[i - 1] + sortedCosts[i - 1];
        }

        int m = sc.nextInt();
        StringBuilder output = new StringBuilder(m * 12); 

        for (int q = 0; q < m; q++) {
            int type = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (type == 1) {
                output.append(originalPrefixSum[right] - originalPrefixSum[left - 1]).append('\n');
            } else {
                output.append(sortedPrefixSum[right] - sortedPrefixSum[left - 1]).append('\n');
            }
        }
        System.out.print(output);
    }

    private static void shuffle(long[] a) {
        Random rnd = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            long temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}