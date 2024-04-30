import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            long sum = 0;
            int day = in.nextInt();
            long[] arr = new long[day];
            long max = 0;
            for (int j = 0; j < day; j++) {
                arr[j] = in.nextInt();
            }
            for (int j=day-1; j>=0; j--) {
                if(arr[j]>max) max = arr[j];
                else sum += (max-arr[j]);
            }
            System.out.println(sum);
        }
    }
}