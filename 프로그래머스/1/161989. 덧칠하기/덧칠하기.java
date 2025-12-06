import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : section) {
            list.add(i);
        }
        int end = 0;
        for (int i=1; i<=n; i++) {
            if (list.contains(i) && i > end) {
                end = i + m - 1;
                answer++;
            }
        }
        return answer;
    }
}