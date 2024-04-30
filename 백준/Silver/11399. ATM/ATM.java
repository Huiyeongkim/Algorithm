import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum=0;
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            int a = in.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr); //오름차순 정렬
        int b=0;
        for (int i=0; i<N; i++) {
            b += arr[i];
            sum += b;
        }
        System.out.println(sum);
    }
}