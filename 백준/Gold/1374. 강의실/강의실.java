import java.io.*;
import java.util.*;

public class Main {
    static class C{
        int start, end;
        C(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        C[] arr = new C[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[i] = new C(b, c);
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a.start, b.start));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (C c : arr) {
            if (!pq.isEmpty() && pq.peek() <= c.start) {
                pq.poll();
            }
            pq.add(c.end);
        }

        System.out.println(pq.size());
    }
}