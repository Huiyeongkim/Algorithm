import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int count = 0;
        int max = arr[0]-1;
        int k = arr[0];
        boolean bo = false;
        for(int i = 1; i < N; i++) {
            if(arr[i-1] == arr[i]) {
                count++;
            }else {
                count = 0;
            }

            if(max < count) {
                max = count;
                k = arr[i-1];
                bo = true;
            }
            else if(max == count && bo == true) {
                k = arr[i-1];
                bo = false;
            }
        }

        System.out.println((int)Math.round((double)sum / N));
        System.out.println(arr[N / 2]);
        System.out.println(k);
        System.out.println(arr[N - 1] - arr[0]);
    }
}