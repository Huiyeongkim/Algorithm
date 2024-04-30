import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long dp1 = 1;
        long dp2 = 1;
        int divide = K;
        while (divide-->0) {
            dp1 = (dp1 * N)%10007;
            N--;
            dp2 = (dp2 * K)%10007;
            K--;
        }

        long result = (dp1*mod(dp2, 10007))%10007;
        System.out.println(result);
    }
    public static long mod(long a, long m) {
        long m0 = m;
        long x0 = 0;
        long x1 = 1;

        if (m == 1) {
            return 0;
        }

        while (a > 1) {
            long q = a / m;
            long t = m;
            m = a % m;
            a = t;
            t = x0;
            x0 = x1 - q * x0;
            x1 = t;
        }
        if (x1 < 0) {
            x1 += m0;
        }

        return x1;
    }
}