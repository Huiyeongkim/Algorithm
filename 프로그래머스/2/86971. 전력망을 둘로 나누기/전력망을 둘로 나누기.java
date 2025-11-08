import java.util.*;
class Solution {
    static boolean[] visited;
    static List<List<Integer>> graph;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        for (int[] wire : wires) {
            int a = wire[0];
            int b = wire[1];
            visited = new boolean[n + 1];
            visited[b] = true;
            
            int count = DFS(a);
            answer = Math.min(answer, Math.abs(n - 2 * count));
        }
        return answer;
    }
    
    private int DFS(int node) {
        visited[node] = true;
        
        int count = 1;
        for (int next : graph.get(node)) {
            if (!visited[next]) {
                visited[next] = true;
                count += DFS(next);
            }
        }
        return count;
    }
}