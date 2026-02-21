import java.util.*;
class Solution {
    static boolean[] visited;
    static String[] answer;
    static boolean finished = false;
    public String[] solution(String[][] tickets) {    
        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0]))
                return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });
        
        answer = new String[tickets.length + 1];
        visited = new boolean[tickets.length];
        DFS("ICN", 0, tickets);
        
        return answer;
    }
    private static void DFS(String airport, int depth, String[][] tickets) {
        answer[depth] = airport;
        if (depth == tickets.length) {
            finished = true;
            return;
        }
        
        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(airport)) {

                visited[i] = true;
                DFS(tickets[i][1], depth + 1, tickets);

                if (finished) return;

                visited[i] = false;
            }
        }
    }
}