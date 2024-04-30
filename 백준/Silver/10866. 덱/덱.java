import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            if (input.equals("push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }
            else if (input.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }
            else if (input.equals("pop_front")) {
                if (deque.isEmpty()) sb.append(-1).append('\n');
                else sb.append(deque.pollFirst()).append('\n');
            }
            else if (input.equals("pop_back")) {
                if (deque.isEmpty()) sb.append(-1).append('\n');
                else sb.append(deque.pollLast()).append('\n');
            }
            else if (input.equals("size")) {
                sb.append(deque.size()).append('\n');
            }
            else if (input.equals("empty")) {
                if (deque.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }
            else if (input.equals("front")) {
                if (deque.isEmpty()) sb.append(-1).append('\n');
                else sb.append(deque.peek()).append('\n');
            }
            else if (input.equals("back")) {
                if (deque.isEmpty()) sb.append(-1).append('\n');
                else {
                    sb.append(deque.peekLast()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
