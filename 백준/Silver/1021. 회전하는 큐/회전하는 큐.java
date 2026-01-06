import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine());
        int answer = 0;

        for (int i = 0; i < M; i++) {
            int k = Integer.parseInt(st.nextToken());
            int idx = 0;
            for (int num : deque) {
                if (num == k) {
                    break;
                }
                idx++;
            }

            int left = idx;
            int right = deque.size() - idx;
            if (left <= right) {
                for (int j = 0; j < left; j++) {
                    deque.addLast(deque.pollFirst());
                }
                answer += left;
            } else {
                for (int j = 0; j < right; j++) {
                    deque.addFirst(deque.pollLast());
                }
                answer += right;
            }
            deque.pollFirst();
        }

        System.out.println(answer);
    }
}
