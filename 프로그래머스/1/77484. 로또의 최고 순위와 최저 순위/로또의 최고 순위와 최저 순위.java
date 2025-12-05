import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : lottos) {
            if (i == 0) count++;
            else list.add(i);
        }
        int k = 0;
        Arrays.sort(win_nums);
        for (int i : win_nums) {
            if (list.contains(i)) {
                k++;
            }
        }
        
        answer[0] = 7-(k+count) == 7 ? 6 : 7-(k+count);
        answer[1] = 7-k == 7 ? 6 : 7-k;
        return answer;
    }
}