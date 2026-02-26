import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0)+1);
        }
       
        List<Integer> count = new ArrayList<>(map.values());
        count.sort(Collections.reverseOrder());
        
        int answer = 0;
        for (int c : count) {
            k -= c;
            answer++;
            if (k<=0) return answer;
        }
        return answer;
    }
}