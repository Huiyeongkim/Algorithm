import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int round = 1;
        while (N!=0) {
            if ((A+1)/2==(B+1)/2) break;
            A = (A+1)/2;
            B = (B+1)/2;
            N /= 2;
            round++;
        }
        if (N==0) round = -1;
        System.out.println(round);
    }
}