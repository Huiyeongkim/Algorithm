import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = N - 1; i >= 0; i--) {
            if (K >= arr[i]) {
                sum += K / arr[i];
                K %= arr[i];
            }
        }
        System.out.println(sum);
    }
}
