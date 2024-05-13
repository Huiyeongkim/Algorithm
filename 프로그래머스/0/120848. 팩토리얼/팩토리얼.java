class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = 1;
        int i = 1;
        while(true) {
            k *= i;
            if (n==k) {
                answer = i;
                break;
            }
            else if (n<k) {
                answer = i-1;
                break;
            }
            i++;
        }
        return answer;
    }
}
