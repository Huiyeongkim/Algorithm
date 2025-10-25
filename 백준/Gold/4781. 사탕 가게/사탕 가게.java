import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            double M = Double.parseDouble(st.nextToken());
            if (N == 0 && M == 0.00) {
                break;
            }
            int money = (int)(M * 100 + 0.5);
            int[] calories = new int[N];
            int[] prices = new int[N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                calories[i] = Integer.parseInt(st.nextToken());
                prices[i] = (int) (Double.parseDouble(st.nextToken()) * 100 + 0.5);
            }

            int[] dp = new int[money + 1];
            for (int i = 0; i <= money; i++) {
                for (int j = 0; j < N; j++) {
                    if (i >= prices[j]) {
                        dp[i] = Math.max(dp[i], dp[i - prices[j]] + calories[j]);
                    }
                }
            }

            System.out.println(dp[money]);
        }
    }
}