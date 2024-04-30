import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i=0; i<M; i++) {
            int k = Integer.parseInt(st.nextToken());
            if(binary(k)) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
    private static boolean binary(int k) {
        int left = 0;
        int right = N - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            int middle = arr[mid];

            if(k < middle) right = mid - 1;
            else if(k > middle) left = mid + 1;
            else return true;
        }
        return false;
    }
}