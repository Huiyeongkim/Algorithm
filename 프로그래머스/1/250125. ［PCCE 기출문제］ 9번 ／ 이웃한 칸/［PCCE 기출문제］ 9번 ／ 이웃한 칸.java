import java.util.*;
class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;

        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        String target = board[h][w];

        for (int i = 0; i < 4; i++) {
            int a = h + dh[i];
            int b = w + dw[i];

            if (a >= 0 && a < n && b >= 0 && b < n) {
                if (target.equals(board[a][b])) {
                    count++;
                }
            }
        }

        return count;
    }
}