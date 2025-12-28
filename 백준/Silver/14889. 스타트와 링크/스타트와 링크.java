import java.io.*;
import java.util.*;
public class Main {
    static int N;
    static int min = Integer.MAX_VALUE;
    static int[][] arr;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(0, 0);
        System.out.println(min);
    }

    private static void DFS(int idx, int k) {
        if (k > N/2) return;
        if (idx == N) {
            if (k == N/2) func();
            return;
        }

        visited[idx] = true;
        DFS(idx + 1, k + 1);

        visited[idx] = false;
        DFS(idx + 1, k);
    }

    private static void func() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    start += arr[i][j] + arr[j][i];
                }
                else if (!visited[i] && !visited[j]) {
                    link += arr[i][j] + arr[j][i];
                }
            }
        }

        min = Math.min(min, Math.abs(start - link));
    }
}