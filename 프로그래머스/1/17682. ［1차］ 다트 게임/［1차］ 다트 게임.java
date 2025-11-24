import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3]; 
        int idx = 0;                
        int num = 0;            

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (Character.isDigit(c)) {
                if (c == '1' && i + 1 < dartResult.length() 
                    && dartResult.charAt(i + 1) == '0') {
                    num = 10;
                    i++;
                } else {
                    num = c - '0';
                }
            }
            else if (c == 'S') {
                scores[idx] = (int) Math.pow(num, 1);
                idx++;
            } else if (c == 'D') {
                scores[idx] = (int) Math.pow(num, 2);
                idx++;
            } else if (c == 'T') {
                scores[idx] = (int) Math.pow(num, 3);
                idx++;
            }
            else if (c == '*') {
                scores[idx - 1] *= 2;
                if (idx - 2 >= 0) scores[idx - 2] *= 2;
            } else if (c == '#') {
                scores[idx - 1] *= -1;
            }
        }

        return scores[0] + scores[1] + scores[2];
    }
}