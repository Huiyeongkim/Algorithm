import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {     
            map.put(i, map.getOrDefault(i, 0)+1);
        }
    
        if (nums.length/2 > map.size()) return map.size();
        return nums.length/2;
    }
}