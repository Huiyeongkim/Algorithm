class Solution {
    public int solution(int n) {
        if (n % 2 == 1) return 0; 

        int[] dp = new int[n + 1];
        int MOD = 1000000007;

        dp[0] = 1;
        dp[2] = 3;

        long sum = dp[0];
        for (int i = 4; i <= n; i += 2) {
            dp[i] = (int)((dp[i - 2] * 3L + sum * 2L) % MOD);
            sum = (sum + dp[i - 2]) % MOD;
        }

        return dp[n];
    }
}