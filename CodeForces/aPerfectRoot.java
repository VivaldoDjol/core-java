import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0 ){
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                if(n == 1){
                    System.out.print(1);
                } else if (i == n - 1){
                    System.out.print(i + 1);
                } else {
                    System.out.print(i + 1 + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
