import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N + 2];
        for (int stage : stages) {
            count[stage]++;
        }

        int players = stages.length;
        double[][] failRates = new double[N][2]; 

        for (int i = 1; i <= N; i++) {
            int fail = count[i];
            double rate = 0;

            if (players > 0) {
                rate = (double) fail / players;
            }

            failRates[i - 1][0] = i;
            failRates[i - 1][1] = rate;

            players -= fail;
        }

        Arrays.sort(failRates, (a, b) -> {
            if (a[1] == b[1]) return Double.compare(a[0], b[0]);
            return Double.compare(b[1], a[1]);
        });

        for (int i = 0; i < N; i++) {
            answer[i] = (int) failRates[i][0];
        }

        return answer;
    }
}
