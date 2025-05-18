import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, K;
    static int[][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static int answer = 0;
    static int count;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            for (int x = sx; x < ex; x++) {
                for (int y = sy; y < ey; y++) {
                    map[y][x] = 1; // 좌표 변환 (주의!)
                }
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    answer++;
                    count = 1;
                    DFS(i, j);
                    list.add(count);
                }
            }
        }
        list.sort((o1, o2) -> o1 - o2);
        System.out.println(answer);
        for (int i : list) {
            System.out.print(i+" ");
        }
    }

    private static void DFS(int x, int y) {
        visited[x][y] = true;

        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || nx >= N || ny<0 || ny >= M) continue;
            if (map[nx][ny] == 1 || visited[nx][ny]) continue;
            
            count++;
            DFS(nx, ny);
        }
    }
}
