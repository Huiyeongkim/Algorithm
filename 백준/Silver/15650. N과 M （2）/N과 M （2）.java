import java.util.Scanner;

public class Main {
    static int[] arr;
    static int N, M;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        DFS(1, 0);
    }
    public static void DFS(int A, int depth) {
        if (depth == M) {
            for (int val : arr) System.out.print(val+" ");
            System.out.println();
            return;
        }

        for (int i=A; i<=N; i++) {
            arr[depth] = i;
            DFS(i+1, depth+1);
        }
    }
}