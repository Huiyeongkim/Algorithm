import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                if (!st.hasMoreTokens()) break;
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] dp = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j == 1) dp[i][j] = arr[i][j] + dp[i-1][j];
                else if (j == N) dp[i][j] = arr[i][j] + dp[i-1][j-1];
                else dp[i][j] = arr[i][j] + Math.max(dp[i - 1][j], dp[i - 1][j-1]);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            max = Math.max(max, dp[N][i]);
        }
        System.out.println(max);
    }
}