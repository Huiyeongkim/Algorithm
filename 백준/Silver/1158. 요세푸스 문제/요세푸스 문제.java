import java.util.Scanner;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 총 인원 수
        int K = scanner.nextInt(); // 제거할 사람의 간격

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        List<Integer> arr = new ArrayList<>();

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                int person = queue.poll();
                queue.add(person); 
            }

           arr.add(queue.poll());
        }
        System.out.print("<");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i != arr.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}