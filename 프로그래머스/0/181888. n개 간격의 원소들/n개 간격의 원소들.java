import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<num_list.length; i+=n) {
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        int k = 0;
        for (int i : list) {
            answer[k++] = i;
        }
        return answer;
    }
}