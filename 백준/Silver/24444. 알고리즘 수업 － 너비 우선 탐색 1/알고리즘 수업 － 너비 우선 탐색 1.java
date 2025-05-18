import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, R;
    static List<Integer>[] list;
    static int[] visited;
    static int order = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];
        visited = new int[N + 1];

        for (int i=1; i<=N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list[u].add(v);
            list[v].add(u);
        }

        for (int i=1; i<=N; i++) {
            list[i].sort(Comparator.comparingInt(o -> o));
        }

        BFS(R);

        for (int i=1; i<=N; i++) {
            System.out.println(visited[i]);
        }
    }

    private static void BFS(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = order++;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int next : list[cur]) {
                if (visited[next] == 0) {
                    visited[next] = order++;
                    q.add(next);
                }
            }

        }
    }
}