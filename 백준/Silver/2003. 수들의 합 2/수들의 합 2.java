import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] arr = new int[N];
        
        for (int i =0 ; i<N; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;
        
        for (int i=0; i<N; i++) {
            int j = i;
            int sum = 0;
            
            while(j<N) {
                sum += arr[j];
                if (sum>=M) break;
                j++;
            }
            if (sum== M) count++; 
        }
        System.out.println(count);
    }
}
