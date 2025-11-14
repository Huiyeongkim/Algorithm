import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[N+1];
            dp[1] = 1;
            if (N == 1) {
                System.out.println(dp[1]);
                continue;
            }
            dp[2] = 2;
            if (N == 2) {
                System.out.println(dp[2]);
                continue;
            }
            dp[3] = 4;
            if (N == 3) {
                System.out.println(dp[3]);
                continue;
            }

            for (int j = 4; j <= N; j++) {
                dp[j] = (dp[j - 1] + dp[j - 2] + dp[j - 3]) % 1000000009;
            }
            System.out.println(dp[N] % 1000000009);
        }
    }
}