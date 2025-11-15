import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        boolean[] b = new boolean[N+1];
        Arrays.fill(b, false);
        for (int i = 0; i < P; i++) {
            b[Integer.parseInt(st.nextToken())] = true;
        }

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            list.add(new ArrayList<>());
            for (int j = 0; j < K; j++) {
                list.get(i).add(Integer.parseInt(st.nextToken()));
            }
        }
        
        boolean changed = true;
        while (changed) {
            changed = false;
            for (List<Integer> party : list) {
                boolean hasTruth = false;
                for (int person : party) {
                    if (b[person]) {
                        hasTruth = true;
                        break;
                    }
                }
                if (hasTruth) {
                    for (int person : party) {
                        if (!b[person]) {
                            b[person] = true;
                            changed = true;
                        }
                    }
                }
            }
        }

        int answer = 0;
        for (List<Integer> party : list) {
            boolean hasTruth = false;
            for (int person : party) {
                if (b[person]) {
                    hasTruth = true;
                    break;
                }
            }
            if (!hasTruth) answer++;
        }

        System.out.println(answer);
    }
}