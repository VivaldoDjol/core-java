import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int countImpossible = 0;
            int balance = 0;

            for(int i = 0; i < n; i++){
                char c = s.charAt(i);
                if(c == '('){
                    balance++;
                } else if(c == ')'){
                    balance--;
                }
                if(balance < 0){
                    countImpossible++;
                    balance = 0;
                }
            }
            System.out.println(countImpossible);
        }
        sc.close();
    }
}
