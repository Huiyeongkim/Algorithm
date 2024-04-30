import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static boolean[] visit;
    static int[][] arr;
    static int N, M, V;
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<Integer>();

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        V = in.nextInt();

        visit = new boolean[N + 1];
        arr = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            arr[a][b] = arr[b][a] = 1;
        }
        DFS(V);
        sb.append("\n");

        visit = new boolean[N+1];
        BFS(V);

        System.out.println(sb);
    }

    public static void DFS(int V) {
        visit[V] = true;
        sb.append(V).append(" ");

        for (int i=0; i<=N; i++) {
            if (arr[V][i] ==1 && !visit[i]) DFS(i);
        }
    }
    public static void BFS(int V) {
        q.offer(V);
        visit[V] = true;

        while(!q.isEmpty()) {
            V = q.poll();
            sb.append(V).append(" ");
            
            for (int i=0; i<=N; i++) {
                if (arr[V][i] == 1 && !visit[i]) {
                    q.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}