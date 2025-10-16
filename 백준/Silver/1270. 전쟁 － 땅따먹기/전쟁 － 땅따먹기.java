import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            StringTokenizer st = new StringTokenizer(line);
            HashMap<Long, Integer> map = new HashMap<>();
            Long T = Long.parseLong(st.nextToken());
            for (int j = 0; j < T ; j++) {
                while (!st.hasMoreTokens()) {
                    line = br.readLine();
                    st = new StringTokenizer(line);
                }

                Long k =  Long.parseLong(st.nextToken());
                map.put(k, map.getOrDefault(k, 0) + 1);
            }
            boolean found = false;
            for (Long j : map.keySet()) {
                if (map.get(j) > T/2) {
                    System.out.println(j);
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println("SYJKGW");
        }
    }
}
