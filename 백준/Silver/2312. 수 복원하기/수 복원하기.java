import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            solve(k);
        }
    }

    private static void solve(int k) {
        for (int i=2; i<=k; i++) {
            int count = 0;
            while (k % i == 0) {
                k /= i;
                count++;
            }
            if (count > 0)
                System.out.println(i+ " " + count);
        }
    }

}