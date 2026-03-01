class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start = (total - (num - 1) * num / 2) / num;
        
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}