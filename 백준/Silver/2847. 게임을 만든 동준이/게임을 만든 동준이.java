import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int before = 0;

        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
            before += arr[i];
        }

        for (int i=N-1; i>0; i--) {
            if (arr[i-1] >=arr[i]) {
                arr[i-1] = arr[i]-1;
            }
        }

        int after = 0;
        for (int i=0; i<N; i++) {
            after += arr[i];
        }
        System.out.println(before-after);

    }
}