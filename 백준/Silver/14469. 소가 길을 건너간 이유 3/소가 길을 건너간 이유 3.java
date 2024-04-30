import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][2];
        for (int i=0; i<N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        for (int i=0; i<N-1; i++) {
            for (int j=N-1; j>i; j--) {
                if (arr[j-1][0] > arr[j][0]) {
                    int temp = arr[j][0];
                    arr[j][0] = arr[j-1][0];
                    arr[j-1][0] = temp;
                    temp = arr[j][1];
                    arr[j][1] = arr[j-1][1];
                    arr[j-1][1] = temp;
                }
            }
        }

        int sum = 0;
        for (int i=0; i<N; i++) {
            if (sum < arr[i][0])
                sum = arr[i][0] + arr[i][1];
            else
                sum = sum + arr[i][1];
        }

        System.out.println(sum);
    }
}