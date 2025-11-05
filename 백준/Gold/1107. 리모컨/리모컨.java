import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        boolean[] broken = new boolean[10];

        if (M > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                broken[Integer.parseInt(st.nextToken())] = true;
            }
        }

        int answer = Math.abs(N - 100);

        for (int i = 0; i <= 999999; i++) {
            int len = possible(i, broken);
            if (len > 0) {
                int press = Math.abs(i - N);
                answer = Math.min(answer, len + press);
            }
        }

        System.out.println(answer);
    }

    private static int possible(int num, boolean[] broken) {
        if (num == 0) {
            return broken[0] ? 0 : 1;
        }

        int len = 0;
        while (num > 0) {
            if (broken[num % 10]) return 0;
            len++;
            num /= 10;
        }
        return len;
    }
}