import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long sum = 0;
        int[] len = new int[N-1];
        for (int i=0; i<N-1; i++) len[i] = in.nextInt();

        int[] mon = new int[N];
        for (int i=0; i<N; i++) mon[i] = in.nextInt();

        int min = mon[0];
        for (int i=0; i<N-1; i++) {
            if (mon[i] <= min) {
                min = mon[i];
            }
            sum += (long) min*len[i];
        }
        System.out.println(sum);
    }
}