import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int k = Integer.parseInt(st.nextToken());
            int count = countOccurrences(k);
            sb.append(count).append(" ");
        }
        
        System.out.println(sb.toString());
    }

    private static int countOccurrences(int target) {
        int left = lowerBound(target);
        int right = upperBound(target);
        return right - left;
    }

    private static int lowerBound(int target) {
        int left = 0;
        int right = N;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    private static int upperBound(int target) {
        int left = 0;
        int right = N;

        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}
