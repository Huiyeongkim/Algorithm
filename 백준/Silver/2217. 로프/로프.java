import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int max = 0;
        int[] arr = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        
        for (int j=0; j<N; j++) {
                    int w = 0;

            for (int i = N - 1; i >=j; i--) {
                w += arr[j];
            }
            max = Math.max(w, max);
        }
        System.out.println(max);
    }
}
