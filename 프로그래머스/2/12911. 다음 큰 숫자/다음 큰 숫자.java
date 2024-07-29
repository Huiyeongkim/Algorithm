class Solution {
    public int solution(int n) {
        int answer = n;
        int k = 0;
        while(n>0) {
            if (n%2==1) k++;
            n /= 2;
        }
        while (true) {
            answer+=1;
            int ans = answer;
            int k2 = 0;
            while(ans>0) {
                if (ans%2==1) k2++;
                ans /= 2;
            }
            if (k2 == k) return answer;
        }
    }
}