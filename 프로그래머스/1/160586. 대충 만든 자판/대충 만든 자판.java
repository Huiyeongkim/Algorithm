import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<keymap.length; i++) {
            for (int j=0; j<keymap[i].length(); j++) {
                String a = keymap[i].charAt(j)+"";
                if (map.containsKey(a)) {
                    int k = map.get(a);
                    int min = Math.min(k, j+1);
                    map.put(a, min);
                }
                else {
                    map.put(a, j+1);
                }
            }
        }

        for (int i=0; i<targets.length; i++) {
            int temp = 0;
            boolean b = true;
            for (int j=0; j<targets[i].length(); j++) {
                String a = targets[i].charAt(j)+"";
                if (map.containsKey(a)) {
                    temp += map.get(a);
                } else b = false;
            }
            if (!b) answer[i] = -1;
            else answer[i] = temp;
        }
        
        return answer;
    }
}