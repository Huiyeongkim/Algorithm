import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int left = 0;
        int num = 0;
        int[] count = new int[10];
        for (int right = 0; right < N; right++) {
            int fruit = arr[right];
            if (count[fruit] == 0) {
                num++;
            }
            count[fruit]++;
            while (num > 2) {
                int A = arr[left];
                count[A]--;
                if (count[A] == 0) {
                    num--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}
