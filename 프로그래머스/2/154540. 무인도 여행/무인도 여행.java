import java.util.*;

class Solution {
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        int r = maps.length;
        int c = maps[0].length();
        visited = new boolean[r][c];

        char[][] ch = new char[r][c];
        for (int i = 0; i < r; i++) {
            ch[i] = maps[i].toCharArray();
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && ch[i][j] != 'X') {
                    list.add(BFS(ch, i, j));
                }
            }
        }

        if (list.isEmpty()) return new int[]{-1};
        Collections.sort(list); 
        return list.stream().mapToInt(i -> i).toArray();
    }

    private int BFS(char[][] ch, int x, int y) {
        int r = ch.length;
        int c = ch[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        int total = ch[x][y] - '0';

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int cx = curr[0];
            int cy = curr[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < r && ny >= 0 && ny < c 
                    && !visited[nx][ny] && ch[nx][ny] != 'X') {
                    visited[nx][ny] = true;
                    total += ch[nx][ny] - '0';
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        return total;
    }
}