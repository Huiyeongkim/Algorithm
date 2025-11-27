import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pos = new int[n+1];

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            pos[x] = i; 
        }

        int len = 1;
        int cur = 1;

        for (int i = 2; i <= n; i++) {
            if (pos[i-1] < pos[i]) {
                cur++;
            } else {
                cur = 1;
            }
            len = Math.max(len, cur);
        }

        System.out.println(n - len);
    }
}