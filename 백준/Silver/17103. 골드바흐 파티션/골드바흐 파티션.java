import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        boolean[] isPrime = sieveOfEratosthenes(1000000);
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i = 2; i <= N / 2; i++) {
                int j = N - i;
                if (isPrime[i] && isPrime[j]) {
                    result++;
                }
            }
            bw.append(result+"\n");
        }
        bw.flush();
    }

    private static boolean [] sieveOfEratosthenes(int MAX) {
        boolean[] isPrime = new boolean[MAX + 1];
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}
