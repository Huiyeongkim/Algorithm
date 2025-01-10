import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{priority, i});
                priorityQueue.offer(priority);
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                if (!priorityQueue.isEmpty() && current[0] == priorityQueue.peek()) {
                    priorityQueue.poll();
                    count++;

                    if (current[1] == M) {
                        System.out.println(count);
                        break;
                    }
                } else {
                    queue.offer(current);
                }
            }
        }
    }
}