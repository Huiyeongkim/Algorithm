import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            long k = Long.parseLong(br.readLine());
            if (map.containsKey(k)) {
                int val = map.get(k);
                map.put(k, val + 1);
            } else {
                map.put(k, 1);
            }
        }

        long maxKey = Long.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            long key = entry.getKey();
            int value = entry.getValue();
            if (value > maxValue || (value == maxValue && key < maxKey)) {
                maxKey = key;
                maxValue = value;
            }
        }

        System.out.println(maxKey);
    }
}
