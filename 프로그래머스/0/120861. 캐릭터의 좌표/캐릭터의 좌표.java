class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
    
        for (int i=0; i<keyinput.length; i++) {
            if (keyinput[i].equals("left") && (-board[0]/2 < answer[0])) {
                answer[0]--;
            }
            else if (keyinput[i].equals("right") && (board[0]/2 > answer[0])) {
                answer[0]++;
            }
            else if (keyinput[i].equals("up") && (board[1]/2 > answer[1])) {
                answer[1]++;
            }
            else if (keyinput[i].equals("down")&& (-board[1]/2 < answer[1])) {
                answer[1]--;
            }
        }
        return answer;
    }
}