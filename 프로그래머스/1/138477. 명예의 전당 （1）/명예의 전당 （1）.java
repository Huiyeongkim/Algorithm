import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<score.length; i++) {
            list.add(score[i]);
            list.sort(Comparator.reverseOrder());
            if (i < k) answer[i] = list.get(i);
            else
                answer[i] = list.get(k-1);
        }
       
        return answer;
    }
}