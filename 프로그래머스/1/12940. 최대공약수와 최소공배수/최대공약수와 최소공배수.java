class Solution {
    public long[] solution(int n, int m) {
        long[] answer = new long[2];

        for (long i=Math.min(n, m); i>=1; i--) {
            if (n%i==0&&m%i==0) {
                answer[0] = i;
                break;
            } 
        }
        answer[1] = n*m/answer[0];
        return answer;
    }
}