class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            int sum = 0;
            int k = i;
            while(n>sum) {
                sum += k;
                k++;
                if (sum==n) answer++;
            }
        }
        return answer;
    }
}