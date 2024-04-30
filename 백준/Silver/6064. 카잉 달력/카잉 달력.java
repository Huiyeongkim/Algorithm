import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
        
            if (x>y) {
                int temp = x;
                x= y;
                y=temp;
                
                temp = N;
                N = M;
                M = temp;
            }
            int b = x;
            boolean check = false;
            for (int j = x; j <= (N * M); j += N) {

                if (y==b) {
                    System.out.println(j);
                    check = true;
                    break;
                }

                b= b+N;
                while(b>M) b-=M;
            }

            if (!check) {
                System.out.println("-1");
            }
        }
    }
}