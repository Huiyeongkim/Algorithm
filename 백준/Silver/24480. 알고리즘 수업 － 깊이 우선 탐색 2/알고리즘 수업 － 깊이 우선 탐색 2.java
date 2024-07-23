import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, R;
    static int count = 1;
    static int[] arr;
    static boolean[] visited;
    static List<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];  // 정점 번호가 1부터 시작하므로 N+1 크기
        visited = new boolean[N + 1];  // 정점 번호가 1부터 시작하므로 N+1 크기
        list = new ArrayList[N + 1];  // 정점 번호가 1부터 시작하므로 N+1 크기

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list[u].add(v);
            list[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list[i], Collections.reverseOrder());
        }

        DFS(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void DFS(int node) {
        visited[node] = true;
        arr[node] = count++;

        for (int neighbor : list[node]) {
            if (!visited[neighbor]) {
                DFS(neighbor);
            }
        }
    }
}
