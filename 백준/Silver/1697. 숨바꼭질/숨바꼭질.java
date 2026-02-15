import java.io.*;
import java.util.*;
public class Main {
    static int N, K;
    static int MAX = 100000;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[MAX + 1];

        System.out.println(BFS());
    }
    private static int BFS() {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{N, 0});
        visited[N] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int status = poll[0];
            int sec = poll[1];

            if (status == K) return sec;

            int[] nexts = {status - 1, status + 1, status * 2};

            for (int next : nexts) {
                if (next < 0 || next > MAX) continue;
                if (visited[next]) continue;

                visited[next] = true;
                queue.add(new int[]{next, sec + 1});
            }
        }
        return -1;
    }
}
