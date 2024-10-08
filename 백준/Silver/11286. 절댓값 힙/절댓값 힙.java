import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1)>Math.abs(o2)) return 1;
                else if(Math.abs(o1)==Math.abs(o2)) return o1-o2;
                else return -1;
            }
        });
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if (x==0) {
                if (queue.isEmpty()) System.out.println(0);
                else System.out.println(queue.poll());
            }
            else queue.add(x);
        }
    }
}