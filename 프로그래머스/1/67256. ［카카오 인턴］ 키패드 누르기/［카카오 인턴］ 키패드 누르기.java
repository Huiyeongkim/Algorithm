class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
    
        int lx = 3, ly = 0;
        int rx = 3, ry = 2;
        
        for (int k=0; k<numbers.length; k++) {
            int num = numbers[k];
            int x = 0;
            int y = 0;
            
            if (num == 0) {
                x = 3;
                y = 1;
            } else if (num == 1 || num == 4 || num == 7) {
                x = (num - 1) / 3;
                y = 0;
            } else if (num == 3 || num == 6 || num == 9) {
                x = (num - 3) / 3;
                y = 2;
            } else { 
                x = (num - 2) / 3;
                y = 1;
            }
            
            int llen = Math.abs(x - lx) + Math.abs(y - ly);
            int rlen = Math.abs(x - rx) + Math.abs(y - ry);
            
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                lx = x; ly = y;
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                rx = x; ry = y;
            } else {
                if (llen < rlen) {
                    answer += "L";
                    lx = x; ly = y;
                } else if (rlen < llen) {
                    answer += "R";
                    rx = x; ry = y;
                } else { 
                    if (hand.equals("right")) {
                        answer += "R";
                        rx = x; ry = y;
                    } else {
                        answer += "L";
                        lx = x; ly = y;
                    }
                }
            }
        }
        return answer;
    }
}