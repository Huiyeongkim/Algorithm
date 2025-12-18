import java.io.*;
import java.util.*;
public class Main {
    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        DFS(0, 1);
        System.out.print(sb);
    }

    private static void DFS(int d, int start) {
        if (d==m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[d] = i;
            DFS(d+1, i);
        }
    }
}