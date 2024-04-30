import java.util.*;

public class Main {
    static int N, E;
    static int count=0;
    static boolean[] visit;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        E = in.nextInt();

        visit = new boolean[N + 1];
        arr = new int[N + 1][N + 1];

        for (int i=0; i<E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            arr[a][b] = arr[b][a] = 1;
        }
        DFS(1);
        System.out.println(count-1);
    }
    public static void DFS(int V) {
        visit[V] = true;
        count++;

        for (int i=0; i<=N; i++) {
            if (arr[V][i] ==1 && !visit[i]) DFS(i);
        }
    }
}