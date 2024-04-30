import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int result = 0;
        
        for (int i=1; i<K+1; i++) {
            N -= i;
            if (N<0) break;
        }
        if (N>=0) {
            if (N%K>0) result = K;
            else result = K-1;
        }
        else {
            System.out.println("-1");
            return;
        }
        System.out.println(result);
    }
}