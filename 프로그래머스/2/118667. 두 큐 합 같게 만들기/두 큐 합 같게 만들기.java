import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long total = 0;
        long qsum = 0;

        for (int i = 0; i < queue1.length; i++) {
            total += queue1[i] + queue2[i];
            qsum += queue1[i];
            q1.offer(queue1[i]);
            q2.offer(queue2[i]);
        }

        if (total % 2 != 0) return -1;
        long target = total / 2;

        int answer = 0;
        int limit = queue1.length * 3;

        while (qsum != target && answer <= limit) {
            if (qsum > target) {
                int k = q1.poll();
                qsum -= k;
                q2.offer(k);
            } else {
                int k = q2.poll();
                qsum += k;
                q1.offer(k);
            }
            answer++;
        }

        return (qsum == target) ? answer : -1;
    }
}