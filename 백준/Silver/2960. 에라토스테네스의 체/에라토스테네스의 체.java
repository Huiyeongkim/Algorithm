import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        boolean[] f = new boolean[N+1];

        for (int i=2; i<=N; i++) {
            if (!f[i]) {
                K--;
                if (K==0) {
                    System.out.println(i);
                    break;
                }
                for (int j=i*i; j<=N; j+=i) {
                    if (!f[j]) {
                        f[j] = true;
                        K--;
                        if (K==0) {
                            System.out.println(j);
                            break;
                        }
                    }
                }
            }
        }
    }
}