import java.util.*;
class Solution {
    static boolean[] visited;
    static int answer = 0;
    static int[][] arr;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        arr = dungeons;
        DFS(k, 0);
        return answer;
    }

    private void DFS(int k, int count) {
        answer = Math.max(answer, count);

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i][0];
            int b = arr[i][1];

            if (!visited[i] && k >= a) {
                visited[i] = true;
                DFS(k - b, count + 1);
                visited[i] = false;
            }
        }
    }
}