import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) return 0;

        int n = words.length;
        Queue<String> queue = new LinkedList<>();
        Queue<Integer> depth = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.offer(begin);
        depth.offer(0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int count = depth.poll();

            if (current.equals(target)) {
                return count;
            }

            for (int i = 0; i < n; i++) {
                if (!visited[i] && isConvertible(current, words[i])) {
                    visited[i] = true;
                    queue.offer(words[i]);
                    depth.offer(count + 1);
                }
            }
        }

        return 0;
    }

    private static boolean isConvertible(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
            if (diff > 1) return false;
        }
        return diff == 1;
    }
}