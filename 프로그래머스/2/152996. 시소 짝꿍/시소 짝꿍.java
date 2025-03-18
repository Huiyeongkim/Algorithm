import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int w : weights) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        
        for (int w : map.keySet()) {
            long count = map.get(w);
            answer += (count * (count - 1)) / 2;
            if (map.containsKey(w * 3 / 2) && (w * 3) % 2 == 0) {
                answer += count * map.get(w * 3 / 2);
            }
            if (map.containsKey(w * 2) ) {
                answer += count * map.get(w * 2);
            }
            if (map.containsKey(w * 4 / 3) && (w * 4) % 3 == 0) {
                answer += count * map.get(w * 4 / 3);
            }
        }

        return answer;
    }
}