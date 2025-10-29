import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(H);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                int a = H[i] + H[j];
                int left = 0;
                int right = N - 1;
                
                while (left < right) {
                    if (left == i || left == j) {
                        left++;
                        continue;
                    }
                    if (right == i || right == j) {
                        right--;
                        continue;
                    }
                    int b = H[left] + H[right];
                    int diff = Math.abs(a - b);
                    
                    min = Math.min(min, diff);
                    if (b > a) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        System.out.println(min);
    }
}