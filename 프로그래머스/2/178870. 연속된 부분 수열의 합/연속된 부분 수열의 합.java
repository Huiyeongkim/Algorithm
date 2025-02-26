import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int len = sequence.length;
        int sum = 0;
        int right = 0;
        
        for (int left = 0; left < sequence.length; left++) {
            while (right < sequence.length && sum < k) { 
                sum += sequence[right];
                right++;
            }
            
            if (sum == k && (right - left - 1) < len) { 
                answer[0] = left;
                answer[1] = right - 1;
                len = right - left - 1;
            }
            sum -= sequence[left];
        }
        return answer;
    }
}