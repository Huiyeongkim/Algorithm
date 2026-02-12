import java.util.*;
class Solution {
    public int[] solution(int n, int s) {
        if (s < n) return new int[]{-1};
        int[] answer = new int[n];
        int k = s/n;
        int m = s%n;
        
        Arrays.fill(answer, k);
        for (int i=n-1; i>=n-m; i--) {
            answer[i] += 1;
        }
        return answer;
    }
}