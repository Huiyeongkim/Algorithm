import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        char[][] map = new char[m][n];
        for (int i=0; i<m; i++) map[i] = board[i].toCharArray();
        int answer = 0;
        
        while(true) {
            boolean[][] visited = new boolean[m][n];
            
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char c = map[i][j];
                    if (c == '\0') continue;
                    if (map[i][j + 1] == c &&
                        map[i + 1][j] == c && 
                        map[i + 1][j + 1] == c
                       ) {
                        visited[i][j] = true;
                        visited[i][j + 1] = true;
                        visited[i + 1][j] = true;
                        visited[i + 1][j + 1] = true;
                    }
                }
            }
            
            boolean any = false;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j]) {
                        any = true;
                        break;
                    }
                }
                if (any) break;
            }
            if (!any) break;
            
            int count = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j] && map[i][j] != '\0') {
                        map[i][j] = '\0';
                        count++;
                    }
                }
            }
            answer += count;

            for (int col = 0; col < n; col++) {
                int wr = m - 1;
                for (int row = m - 1; row >= 0; row--) {
                    if (map[row][col] != '\0') {
                        map[wr][col] = map[row][col];
                        if (wr != row) map[row][col] = '\0';
                        wr--;
                    }
                }
            }

        }
        return answer;
    }
}