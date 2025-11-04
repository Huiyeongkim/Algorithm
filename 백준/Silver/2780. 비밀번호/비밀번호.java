import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(){{add(7); }});
        map.put(1, new ArrayList<>(){{add(2); add(4);}});
        map.put(2, new ArrayList<>(){{add(1); add(3); add(5); }});
        map.put(3, new ArrayList<>(){{add(2); add(6);}});
        map.put(4, new ArrayList<>(){{add(1); add(5); add(7); }});
        map.put(5, new ArrayList<>(){{add(2); add(4); add(6); add(8); }});
        map.put(6, new ArrayList<>(){{add(3); add(5); add(9); }});
        map.put(7, new ArrayList<>(){{add(4); add(8); add(0); }});
        map.put(8, new ArrayList<>(){{add(5); add(7); add(9); }});
        map.put(9, new ArrayList<>(){{add(6); add(8); }});

        while (T-- > 0) {
            long answer = 0;
            int N = Integer.parseInt(br.readLine());

            long[][] dp = new long[N+1][10];
            for (int i = 0; i < 10; i++) {
                dp[1][i] = 1;
            }

            for (int i = 2; i <= N; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k : map.get(j))
                        dp[i][j] = (dp[i][j] + dp[i-1][k]) % 1234567;
                }
            }
            for (int i = 0; i < 10; i++) {
                answer = (answer + dp[N][i]) % 1234567;
            }
            System.out.println(answer);
        }
    }
}