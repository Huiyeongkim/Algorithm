import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // 계단의 개수
        
        int[] score = new int[n+1]; // 계단의 점수를 저장할 배열
        for (int i = 1; i <= n; i++) {
            score[i] = scanner.nextInt();
        }
        
        int[] dp = new int[n+1]; // 최대 점수를 저장할 배열
        
        if (n >= 1) {
            dp[1] = score[1];
        }
        if (n >= 2) {
            dp[2] = Math.max(score[1] + score[2], score[2]);
        }
        
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-2] + score[i], dp[i-3] + score[i-1] + score[i]);
        }
        
        System.out.println(dp[n]);
    }
}
