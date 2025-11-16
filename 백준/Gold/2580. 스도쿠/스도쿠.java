import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr = new int[9][9];
    static ArrayList<int[]> blanks = new ArrayList<>();
    static boolean solved = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 0) {
                    blanks.add(new int[]{i, j});
                }
            }
        }

        DFS(0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(arr[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void DFS(int depth) {
        if (depth == blanks.size()) {
            solved = true;
            return;
        }

        int[] pos = blanks.get(depth);
        int r = pos[0];
        int c = pos[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(r, c, num)) {
                arr[r][c] = num;
                DFS(depth + 1);
                if (solved) return;
                arr[r][c] = 0;
            }
        }
    }

    static boolean isValid(int r, int c, int num) {
        for (int i = 0; i < 9; i++) {
            if (arr[r][i] == num) return false;
            if (arr[i][c] == num) return false;
        }
        
        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == num) return false;
            }
        }

        return true;
    }
}