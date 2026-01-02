class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int x = Math.max(wallet[0], wallet[1]);
        int y = Math.min(wallet[0], wallet[1]);
        
        int a = Math.max(bill[0], bill[1]);
        int b = Math.min(bill[0], bill[1]);
        
        while(a>x || b>y) {
            if (a<=x && b<=y) {
                return answer;
            }
            a /= 2;
            int temp = a;
            a = Math.max(temp, b);
            b = Math.min(temp, b);
            answer++;
        }
        
        return answer;
    }
}