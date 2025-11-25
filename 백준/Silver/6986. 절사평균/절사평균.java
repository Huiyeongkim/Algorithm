import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(arr);
        
        double sum1 = 0;
        for (int i = K; i < N - K; i++) {
            sum1 += arr[i];
        }
        double avg1 = sum1 / (N - 2 * K);

        double sum2 = 0;
        for (int i = 0; i < K; i++) sum2 += arr[K];
        for (int i = K; i < N - K; i++) sum2 += arr[i];
        for (int i = 0; i < K; i++) sum2 += arr[N - K - 1];

        double avg2 = sum2 / N;
        System.out.println(String.format("%.2f", avg1));
        System.out.println(String.format("%.2f", avg2));
    }
}