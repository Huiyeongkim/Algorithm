import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        TreeSet<Integer> treeSet = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<A; i++) {
            treeSet.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<B; i++) {
            int x = Integer.parseInt(st.nextToken());
            if (treeSet.contains(x)) {
                count++;
            }
        }
        System.out.println(A+B-2*count);
    }
}