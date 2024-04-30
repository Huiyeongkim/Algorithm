import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N 입력 받기
        int N = scanner.nextInt();

        // A 배열 입력 받기
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // B 배열 입력 받기
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        // A 배열 오름차순으로 정렬
        Arrays.sort(A);

        // B 배열 내림차순으로 정렬
        Arrays.sort(B);

        // S 값 계산
        int S = 0;
        for (int i = 0; i < N; i++) {
            S += A[i] * B[N - 1 - i];
        }

        // S의 최솟값 출력
         System.out.println(S);
    }
}