import java.util.Arrays;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;

        int[][] meeting = new int[N][2];
        for (int i=0; i<N; i++) {
            meeting[i][0] = in.nextInt();
            meeting[i][1] = in.nextInt();
        }
        Arrays.sort(meeting, (o1, o2) -> {
            if (o1[0]==o2[0]) return o1[1]-o2[1];
            return o1[0]-o2[0];
        });

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0; i<N; i++) {
            int end = meeting[i][1];
            if (!priorityQueue.isEmpty()&&priorityQueue.peek()<=meeting[i][0]) priorityQueue.poll();
            priorityQueue.add(end);
        }
        System.out.println(priorityQueue.size());
    }
}