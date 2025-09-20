import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());

        int answer = 0;
        visited = new boolean[N+1];
        DFS(start);

        for (int i=1; i<=N; i++) {
            if (visited[i]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
    private static void DFS(int index) {
        visited[index] = true;

        int k = arr[index];
        if (index + k < arr.length) DFS(index + k);
        if (index - k > 0) DFS(index - k);
    }
}
