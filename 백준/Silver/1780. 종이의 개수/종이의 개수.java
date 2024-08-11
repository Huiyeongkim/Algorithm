import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] arr = new int[N][N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] answer = new int[3];
        answer = paper(arr, 0, 0, N);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        System.out.println(answer[2]);
    }

    public static int[] paper(int[][] arr, int x, int y, int N) {
        int[] answer = new int[3];

        int firstValue = arr[x][y];

        boolean bool = true;
        for (int i = x; i < x + N; i++) {
            for (int j = y; j < y + N; j++) {
                if (arr[i][j] != firstValue) {
                    bool = false;
                    break;
                }
            }
            if (!bool) break;
        }
        
        if (bool) {
            if (firstValue == -1) {
                answer[0]++;
            } else if (firstValue == 0) {
                answer[1]++;
            } else if (firstValue == 1) {
                answer[2]++;
            }
        } else {
            int newSize = N / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int[] count = paper(arr, x + i * newSize, y + j * newSize, newSize);
                    answer[0] += count[0];
                    answer[1] += count[1];
                    answer[2] += count[2];
                }
            }
        }
        return answer;
    }
}