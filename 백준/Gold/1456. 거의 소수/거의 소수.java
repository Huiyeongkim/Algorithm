import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int result = 0;
        prime = isPrime((int) Math.sqrt(B));
        for (int i = 2; i <= (int) Math.sqrt(B); i++) {
            if (prime[i]) {
                long power = (long) i * i;
                while (power <= B) {
                    if (power >= A) {
                        result++;
                    }
                    if (power > B / i) break;
                    power *= i;
                }
            }
        }
        System.out.println(result);
    }

    private static boolean[] isPrime(int max) {
        prime = new boolean[max + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}