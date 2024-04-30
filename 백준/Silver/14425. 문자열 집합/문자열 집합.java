import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        String[] arrN = new String[N];
        String[] arrM = new String[M];
        
        for (int i=0; i<N; i++) arrN[i] = in.next();
        for (int i=0; i<M; i++) arrM[i] = in.next();
        
        int count = 0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<M; j++) {
                if (arrN[i].equals(arrM[j])) count++;
            }
        }
        System.out.println(count);
    }
}
