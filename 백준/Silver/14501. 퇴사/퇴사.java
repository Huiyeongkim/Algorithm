import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[N + 1][2];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N + 3];

        for (int i = N; i >= 1; i--) {
            dp[i] = dp[i + 1];

            int end = i + arr[i][0];
            if (end <= N + 1) {
                dp[i] = Math.max(dp[i], arr[i][1] + dp[end]);
            }
        }
        System.out.println(dp[1]);
    }
}
