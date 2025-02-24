class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < timelogs.length; i++) {
            boolean k = false;
            int current = startday;
            for (int j = 0; j < timelogs[i].length; j++, current++) {
                int time = schedules[i] + 10;
                if (time%100 >= 60) {
                    time -= 60;
                    time += 100;
                }
                if (timelogs[i][j] > time && (current % 7 != 6 && current % 7 != 0)) {
                    k = true;
                    break;
                }
            }

            if (!k) {
                answer++;
            }
        }

        return answer;
    }
}