import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        while(N!=0) {
            N++;
            int a = N-1;
            int result = 0;
            while(N <= 2*a) {
                int count = 0;
                for (int i = 2; i <= Math.sqrt(N); i++) {
                    if (N % i == 0) break;
                    else count++;
                }
                if (count == Math.floor(Math.sqrt(N))-1) result++;
                N++;
            }
            System.out.println(result);
            N = in.nextInt();
        }
    }
}
