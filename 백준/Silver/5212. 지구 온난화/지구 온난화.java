import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String[][] arr = new String[R][C];
        for (int i = 0; i < R; i++) {
            String k = br.readLine();
            for (int j = 0; j < C; j++) {
                arr[i][j] = k.charAt(j) + "";
            }
        }
        String[][] g = new String[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j].equals("X")) {
                    int count = 0;
                    if (i + 1 >= 0 && i + 1 < R && j >= 0 && j < C) {
                        if (arr[i + 1][j].equals("X")) count++;
                    }
                    if (i - 1 >= 0 && i - 1 < R && j >= 0 && j < C) {
                        if (arr[i - 1][j].equals("X")) count++;
                    }
                    if (i >= 0 && i < R && j + 1 >= 0 && j + 1 < C) {
                        if (arr[i][j + 1].equals("X")) count++;
                    }
                    if (i >= 0 && i < R && j - 1 >= 0 && j - 1 < C) {
                        if (arr[i][j - 1].equals("X")) count++;
                    }

                    if (count >= 2) {
                        g[i][j] = "X";
                    } else {
                        g[i][j] = ".";
                    }
                }
            }
        }

        int ax = 0;
        int ay = Integer.MAX_VALUE;
        int bx = 0;
        int by = 0;
        boolean b = false;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (g[i][j] != null && g[i][j].equals("X") && !b) {
                    ax = i;
                    b = true;
                }
                if (g[i][j] != null && g[i][j].equals("X") && b) {
                    bx = i;
                }
            }
        }
        
        for (int i = 0; i < R; i++) {
            b = false;
            for (int j = 0; j < C; j++) {
                if (g[i][j] != null && g[i][j].equals("X") && !b) {
                    ay = Math.min(ay, j);
                    b = true;
                }
                if (g[i][j] != null && g[i][j].equals("X") && b) {
                    by = Math.max(by, j);
                }
            }
        }
        

        StringBuilder sb = new StringBuilder();
        for (int i = ax; i <= bx; i++) {
            for (int j = ay; j <= by; j++) {
                if (g[i][j] != null && g[i][j].equals("X")) {
                    sb.append(g[i][j]);
                }
                else {
                    sb.append(".");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}