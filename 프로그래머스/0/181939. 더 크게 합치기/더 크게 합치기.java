class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer1 = b;
        int m = b;
        int k = 1;
        while(m>0) {
            k*=10;
            m/=10;
        }
        answer1 += a*k;
        
        int answer2 = a;
        k = 1;
        while(a>0) {
            k*=10;
            a/=10;
        }
        answer2 += b*k;
        
        
        if (answer1 > answer2) answer = answer1;
        else
            answer = answer2;
        return answer;
    }
}