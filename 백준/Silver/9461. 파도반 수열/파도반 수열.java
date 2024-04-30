import java.util.Scanner;

public class Main {
    public static long tri(int N) {
        long[] dp = new long[N+1];
        if (N>=1) dp[1] = 1;
        if (N>=2) dp[2] = 1;
        if (N>=3) dp[3] = 1;
        if (N>=4) dp[4] = 2;
        if (N>=5) dp[5] = 2;
        if (N>=6) {
            for (int i=6; i<=N; i++) {
                dp[i] = dp[i - 1] + dp[i - 5];
            }
        }
        return dp[N];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long[] result = new long[T];

        for (int i=0; i<T; i++) {
            int N = in.nextInt();
            result[i] = tri(N);
        }
        for (int i=0; i<T; i++) {
            System.out.println(result[i]);
        }
    }
}
