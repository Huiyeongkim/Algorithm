import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(i); 
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            boolean max = true;
            
            for (int idx : queue) {
                if (priorities[idx] > priorities[current]) {
                    max = false;
                    break;
                }
            }

            if (max) {
                answer++;
                if (current == location) {
                    return answer;
                }
            } else {
                queue.add(current); 
            }
        }
        return answer;
    }
}