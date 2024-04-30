import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] arr = new int[N];
        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
            treeSet.add(a);
        }

        int x = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i=0; i<N; i++) {
            if (treeSet.contains(x-arr[i])) count++;
        }
        System.out.println(count/2);
    }
}