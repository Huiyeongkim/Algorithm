class Solution {
    public int solution(int[][] board) {
        boolean[][] dang = new boolean[board.length][board.length];
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    dang[i][j] = true;
                    for (int k = 0; k < 8; k++) {
                        int a = i + dx[k];
                        int b = j + dy[k];
                        if (a >= 0 && a < board.length && b >= 0 && b < board.length) {
                            dang[a][b] = true;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!dang[i][j]) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}