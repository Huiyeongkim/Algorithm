import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i=0; i<T; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int r1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r2 = in.nextInt();
            
            int result = 0;
            double dis = (int)(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
            if (x1==x2&&y1==y2&&r1==r2) result = -1;
            else if (dis>Math.pow(r1+r2,2) || dis<Math.pow(r2-r1,2) ) result = 0;
            else if (dis==Math.pow(r2-r1,2) || dis==Math.pow(r1+r2,2) ) result = 1;
            else result = 2;

            System.out.println(result);
        }
    }
}