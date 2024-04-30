import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum  = 0;
        Integer[] arr = new Integer[N];

        for (int i=0; i<N; i++) {
            arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr, Comparator.reverseOrder());
        for (int i=0; i<N; i++) {
            if (i%3==2) continue;
            sum += arr[i];
        }

        System.out.println(sum);
    }
}