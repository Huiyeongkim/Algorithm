import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = in.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = countRepaint(board, i, j);
                min = Math.min(min, count);
            }
        }
        System.out.println(min);
    }
    
    private static int countRepaint(char[][] board, int X, int Y) {
        int count = 0;
        char start = board[X][Y];

        for (int i = X; i < X + 8; i++) {
            for (int j = Y; j < Y + 8; j++) {
                if (board[i][j] != start) count++;
                start = flipColor(start);
            }
            start = flipColor(start);
        }
        return Math.min(count, 64 - count);
    }
    private static char flipColor(char color) {
        return (color == 'B') ? 'W' : 'B';
    }
}