import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = 0;
        
        Arrays.sort(nums);
        max = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
        boolean[] isPrime = sieve(max);
        
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime[sum]) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    private static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}