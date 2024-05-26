import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Boolean[] dp = new Boolean[N+1];
        if (N >= 1) dp[1] = true;
        if (N >= 2) dp[2] = false;
        if (N >= 3) dp[3] = true;
        if (N >= 4) dp[4] = true; 
       
        for (int i = 5; i <= N; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 3] || !dp[i - 4];
        }
        
        if (dp[N]) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}