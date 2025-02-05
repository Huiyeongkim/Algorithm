import java.util.*;
class Solution {
    static List<List<int[]>> arrayList = new ArrayList<>();
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] land) {
        int answer = 0;
        visited = new boolean[land.length][land[0].length];
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<land.length; i++) {
            for (int j=0; j<land[0].length; j++) {
                if (land[i][j]==1 && !visited[i][j]) {
                    List<int[]> list = new ArrayList<>();
                    int size = DFS (land, i, j, list);
                    
                    Set<Integer> set = new HashSet<>();
                    for (int[] k : list) {
                        int col = k[1];
                        if (!set.contains(col)) {
                            map.put(col, map.getOrDefault(col, 0) + size);
                            set.add(col);
                        }
                    }
                }
            }
        }
    
        for (int i : map.values()) {
            answer = Math.max(answer, i); 
        }
        
        return answer;
    }
    private int DFS(int[][] land, int x, int y, List<int[]> list) {
        if (x < 0 || x >= land.length || y < 0 || y >= land[0].length || visited[x][y] || land[x][y] == 0) {
            return 0;
        }
        visited[x][y] = true;
        list.add(new int[]{x, y});
        
        int size = 1;

        for (int i = 0; i < 4; i++) {
            size += DFS(land, x + dx[i], y + dy[i], list);
        }
        
        return size;
    }
}