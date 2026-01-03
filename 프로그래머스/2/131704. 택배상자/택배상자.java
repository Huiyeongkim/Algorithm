import java.util.*;
class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int curr = 1;
        
        for (int o : order) {
            while(curr <= o) {
                stack.push(curr);
                curr++;
            }
            
            if (!stack.isEmpty() && stack.peek() == o) {
                answer++;
                stack.pop();
            } 
            else {
                break;
            }
        }

        return answer;
    }
}