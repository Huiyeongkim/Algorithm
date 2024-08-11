import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(Z(N, r, c));
    }

    public static long Z(int N, int r, int c) {
        int size = (int) Math.pow(2, N);
        int answer = 0;
        while (size > 1) {
            if (r < size/2 && c < size/2) { 
                answer += 0;
            } else if (r < size/2 && c >= size/2) {
                answer += size/2 * size/2;
                c -= size/2;
            } else if (r >= size/2 && c < size/2) {
                answer += 2 * size/2 * size/2;
                r -= size/2;
            } else {
                answer += 3 * size/2 * size/2;
                r -= size/2;
                c -= size/2;
            }
            size = size/2;
        }

        return answer;
    }
}