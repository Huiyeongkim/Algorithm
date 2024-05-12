import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        Arrays.sort(arr);
        Arrays.sort(arr2);

        int S = 0;
        for (int i = 0; i < N; i++) {
            S += arr[i] * arr2[N - 1 - i];
        }
        System.out.println(S);
    }
}
