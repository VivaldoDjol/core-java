import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
      
        while (tests-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String t = sc.next();
            int[] freq = new int[26];
            for (char c : s.toCharArray()) freq[c - 'a']++;
            for (char c : t.toCharArray()) freq[c - 'a']--;
            boolean valid = true;
            for (int count : freq) {
                if (count != 0) {
                    valid = false;
                    break;
                }
            }
            System.out.println(valid ? "YES" : "NO");
        }
        sc.close();
    }
}
