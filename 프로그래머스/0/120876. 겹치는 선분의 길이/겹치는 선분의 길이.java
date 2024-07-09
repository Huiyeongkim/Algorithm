import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] num = new int[201];
        for (int[] line : lines) {
            for (int i=line[0]; i<line[1]; i++) {
                num[i+100]++;
            }
        }
        
        for (int i : num) {
            if (i>=2) answer++;
        }
        return answer;
    }
}