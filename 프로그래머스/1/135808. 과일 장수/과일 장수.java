import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int count = 0;
        for (int i=score.length-1; i>=0; i--) {
            count++;
            if (count%m==0 && count!=0) {
                answer += score[i] * m;    
            }
        }
        return answer;
    }
}