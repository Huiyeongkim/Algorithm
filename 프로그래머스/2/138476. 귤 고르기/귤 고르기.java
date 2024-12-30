import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> count = new ArrayList<>(map.values());
        count.sort(Collections.reverseOrder());
        
        for (int i : count) {
            k -= i;
            answer++;
            if (k <= 0) return answer;
        }
        return answer;
    }
}