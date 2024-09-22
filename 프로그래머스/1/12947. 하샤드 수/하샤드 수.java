class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int a = x;
        int k = 0;
        while (a>0)  {
            k += a%10;
            a /= 10;
        }
        if (x%k==0) answer = true;
        return answer;
    }
}