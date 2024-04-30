import javax.sound.sampled.EnumControl;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> leftQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> rightQueue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (leftQueue.size() == rightQueue.size()) {
                leftQueue.add(num);
                if (!rightQueue.isEmpty()&&leftQueue.peek() > rightQueue.peek()) {
                    leftQueue.add(rightQueue.poll());
                    rightQueue.add(leftQueue.poll());
                }
            }
            else {
                rightQueue.add(num);
                if (leftQueue.peek() > rightQueue.peek()) {
                    leftQueue.add(rightQueue.poll());
                    rightQueue.add(leftQueue.poll());
                }
            }
            bw.write(leftQueue.peek()+"\n");
        }
        bw.flush();
    }
}