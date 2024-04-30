import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if (input.equals("push")) {
                queue.offer(Integer.valueOf(st.nextToken()));
            }
            else if (input.equals("pop")) {
                if (queue.isEmpty()) System.out.println("-1");
                else System.out.println(queue.poll());
            }
            else if (input.equals("size")) {
                System.out.println(queue.size());
            }
            else if (input.equals("empty")) {
                if (queue.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }
            else if (input.equals("front")) {
                if (queue.isEmpty()) System.out.println("-1");
                else System.out.println(queue.peek());
            }
            else if (input.equals("back")) {
                if (queue.isEmpty()) System.out.println("-1");
                else {
                    Queue<Integer> tempQueue = new LinkedList<>(queue);
                    int backElement = 0;
                    while (!tempQueue.isEmpty()) {
                        backElement = tempQueue.poll();
                    }
                    System.out.println(backElement);
                }
            }
        }
    }
}
