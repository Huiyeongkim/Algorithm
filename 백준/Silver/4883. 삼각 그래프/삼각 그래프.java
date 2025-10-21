import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N==0) break;

            long[][] arr = new long[N][3];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            long[][] dp = new long[N][3];
            dp[0][0] = Integer.MAX_VALUE;
            dp[0][1] = arr[0][1];
            dp[0][2] = arr[0][1] + Math.min(arr[0][2], 0);

            for (int i = 1; i < N; i++) {
                dp[i][0] = arr[i][0] + Math.min(dp[i - 1][0], dp[i - 1][1]);
                dp[i][1] = arr[i][1] + Math.min(dp[i][0], Math.min(dp[i - 1][0], Math.min(dp[i - 1][1], dp[i - 1][2])));
                dp[i][2] = arr[i][2] + Math.min(dp[i][1], Math.min(dp[i - 1][1], dp[i - 1][2]));
            }
            System.out.println(count++ + ". " + dp[N - 1][1]);
        }

    }

}