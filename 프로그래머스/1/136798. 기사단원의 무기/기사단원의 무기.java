class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=1; i<=number; i++) {
            int a = num(i);
            if (a <= limit) {
                answer += a;
            }
            else 
                answer += power;
        }
        
        return answer;
    }
    private static int num(int k) {
        int count = 0;
        for (int i = 1; i * i <= k; i++) {
            if (k % i == 0) {
                if (i * i == k) count++; 
                else count += 2;      
            }
        }
        return count;
    }
}