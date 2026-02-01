import java.io.*;
import java.util.*;
public class Main {
    static int N, M;
    static int count, max, temp;
    static int[][] arr;
    static boolean[][] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        count = 0;
        max = 0;
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    count++;
                    max = Math.max(max, DFS(i, j, 0));
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }

    private static int DFS(int x, int y, int temp) {
        visited[x][y] = true;
        temp++;

        if (x + 1 < N && !visited[x + 1][y] && arr[x + 1][y] == 1) {
            temp = DFS(x + 1, y, temp);
        }
        if (x - 1 >= 0 && !visited[x - 1][y] && arr[x - 1][y] == 1) {
            temp = DFS(x - 1, y, temp);
        }
        if (y + 1 < M && !visited[x][y + 1] && arr[x][y + 1] == 1) {
            temp = DFS(x, y + 1, temp);
        }
        if (y - 1 >= 0 && !visited[x][y - 1] && arr[x][y - 1] == 1) {
            temp = DFS(x, y - 1, temp);
        }
        return temp;
    }
}
