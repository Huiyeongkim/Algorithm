import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count = 0;
        while (A < B) {
            if (B % 10 == 1) {
                B /= 10;
                count++;
            }
            else if (B % 2 == 0) {
                B /= 2;
                count++;
            }
            else {
                System.out.println("-1");
                return;
            }
        }
        if (A==B) System.out.println(count+1);
        else System.out.println(-1);
    }
}
