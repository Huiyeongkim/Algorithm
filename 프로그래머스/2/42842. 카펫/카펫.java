class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int i=3; i<=brown; i++) {
            int x = brown - i * 2;
            int a = x / 2 + 2;
            if (yellow == (i-2) * (a -2)) {
                answer[0] = a;
                answer[1] = i;
                return answer;
            }
        }
        return answer;
    }
}