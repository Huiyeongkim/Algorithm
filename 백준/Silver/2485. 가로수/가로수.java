import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] interval = new int[N-1];
        for (int i=0; i<N-1; i++) {
            interval[i] = arr[i+1] - arr[i];
        }

        int gcdValue = interval[0];
        for (int i = 1; i < interval.length; i++) {
            gcdValue = gcd(gcdValue, interval[i]);
        }

        int count = 0;
        for (int gap : interval) {
            count += (gap / gcdValue) - 1;
        }

        System.out.println(count);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}