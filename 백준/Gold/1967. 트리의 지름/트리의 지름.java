import java.io.*;
import java.util.*;
public class Main {
    static List<List<Node>> graph = new ArrayList<>();
    static boolean[] visited;
    static int k;
    static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }

        visited = new boolean[n + 1];
        dfs(1, 0);  

        visited = new boolean[n + 1];
        max = 0;
        dfs(k, 0);

        System.out.println(max);
    }

    static void dfs(int node, int dist) {
        visited[node] = true;

        if (dist > max) {
            max = dist;
            k = node;
        }

        for (Node next : graph.get(node)) {
            if (!visited[next.to]) {
                dfs(next.to, dist + next.weight);
            }
        }
    }

    static class Node {
        int to, weight;
        Node(int t, int w) {
            to = t;
            weight = w;
        }
    }
}