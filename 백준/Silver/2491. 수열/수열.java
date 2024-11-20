import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] sequence = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < N; i++) {
            if (sequence[i] >= sequence[i - 1]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            }
            else {
                currentLength = 1;
            }

        }

        int maxLength2 = 1;
        currentLength = 1;
        for (int i = 1; i < N; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                currentLength++;
                maxLength2 = Math.max(maxLength2, currentLength);
            }
            else {
                currentLength = 1;
            }
        }
        System.out.println(Math.max(maxLength2, maxLength));
    }
}