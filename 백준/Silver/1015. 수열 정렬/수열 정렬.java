import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
            A[i] = arr[i];
        }

        Arrays.sort(arr);
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (A[i] == arr[j]) {
                    B[i] = j;
                    arr[j] = -1;
                    break;
                }
            }
        }
        for (int i=0; i<N; i++) System.out.print(B[i]+" ");
    }
}