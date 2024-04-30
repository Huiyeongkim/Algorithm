import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int c1 = a1*b2 + a2*b1;
        int c2 = a2*b2;

        int N = Math.min(c1, c2);

        for (int i=N; i>=2; i--) {
            if (c1%i==0&&c2%i==0) {
                c1 /= i;
                c2 /= i;
            }
        }
        System.out.println(c1+" "+c2);
    }
}