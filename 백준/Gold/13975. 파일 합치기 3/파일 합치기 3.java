import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            long N = Long.parseLong(st.nextToken());
            Queue<Long> queue = new PriorityQueue<>();

            st = new StringTokenizer(br.readLine());
            for (long j = 0; j < N; j++) {
                long x = Long.parseLong(st.nextToken());
                queue.add(x);
            }

            long sum = 0;
            while (queue.size() > 1) {
                long a = queue.poll();
                long b = queue.poll();
                sum += a + b;
                queue.add(a + b);
            }
            System.out.println(sum);
        }
    }
}