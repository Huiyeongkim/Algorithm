class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        for (int i=1; i<=a; i++) {
            if (a%i==0 && b%i==0) {
                b = b/i;
                a = a/i;
            }
        }
        while(true) {
            if (b%2 ==0) b = b/2;
            else break;
        }
        while(true) {
            if (b%5==0) b = b/5;
            else break;
        }
        if (b!=1) answer = 2;
        return answer;
    }
}