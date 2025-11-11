import java.util.*;
class Solution {
    static List<List<Integer>> graph = new ArrayList<>();
    public int solution(int n, int[][] edge) {
        int answer = 0;
        for (int i=0; i<=n; i++) 
            graph.add(new ArrayList<>());
        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        int[] dist = new int[n+1];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1);
        dist[1] = 0;
        
        while(!q.isEmpty()) {
            int curr = q.poll();
            for (int node : graph.get(curr)) {
                if (dist[node] == -1) {
                    dist[node] = dist[curr] + 1;
                    q.add(node);
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        for (int d : dist)
            max = Math.max(max, d);

        for (int d : dist)
            if (d == max)
                answer++;
        
        return answer;
    }
}