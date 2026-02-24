class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i=1; i<n; i++) {
            int k = i;
            int sum = k;
            while(sum <= n) {
                if (sum == n) {
                    answer++;
                    break;
                }
                k++;
                sum += k;
            }
        }
        return answer;
    }
}