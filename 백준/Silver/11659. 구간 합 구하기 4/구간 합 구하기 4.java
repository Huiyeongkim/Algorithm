import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> prefixSum = new ArrayList<>();
        int sum = 0;
        for (int num : arr) {
            sum += num;
            prefixSum.add(sum);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result;
            if (a == 1) {
                result = prefixSum.get(b - 1);
            } else {
                result = prefixSum.get(b - 1) - prefixSum.get(a - 2);
            }
            System.out.println(result);
        }
    }
}
