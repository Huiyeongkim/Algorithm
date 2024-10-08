import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, String> hash = new HashMap<>();
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            hash.put(st.nextToken(), st.nextToken());
        }

        List<String> list = new ArrayList<>();
        for (String key : hash.keySet()) {
            if (hash.get(key).equals("enter")) list.add(key);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        for (String element : list) {
            System.out.println(element);
        }
    }
}