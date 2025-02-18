import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (a[i % 5] == answers[i]) score[0]++;
            if (b[i % 8] == answers[i]) score[1]++;
            if (c[i % 10] == answers[i]) score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) {
                list.add(i + 1); 
            }
        }
        int[] answer = new int[list.size()];
        int k = 0;
        for (int i : list) {
            answer[k] = i;
            k ++;
        }
        
        return answer;
    }
}