class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i=0; i<quiz.length; i++) {
            String[] ans = quiz[i].split(" ");
            int a = Integer.parseInt(ans[0]);
            int b = Integer.parseInt(ans[2]);
            int sum = 0;
            if (ans[1].equals("+")) sum = a+b;
            else
                sum = a-b;
            if (sum == Integer.parseInt(ans[4])) answer[i] = "O";
            else
                answer[i] = "X";
        }
        return answer;
    }
}