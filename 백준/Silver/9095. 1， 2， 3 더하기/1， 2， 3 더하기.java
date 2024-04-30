import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int j=0; j<T; j++) {
            int N = in.nextInt();
            int[] dp = new int[100];

            if (N>=1) dp[1] = 1;
            if (N>=2) dp[2] = 2;
            if (N>=3) dp[3] = 4;
            for (int i = 4; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            System.out.println(dp[N]);
        }
    }
}