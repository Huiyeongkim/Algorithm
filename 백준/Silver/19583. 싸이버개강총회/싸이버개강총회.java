import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken().replaceAll(":", ""));
        int E = Integer.parseInt(st.nextToken().replaceAll(":", ""));
        int Q = Integer.parseInt(st.nextToken().replaceAll(":", ""));

        HashSet<String> hashSet = new LinkedHashSet<>();
        HashSet<String> hash = new HashSet<>();

        String line = br.readLine();
        while (line != null) {
            st = new StringTokenizer(line);
            int time = Integer.parseInt(st.nextToken().replaceAll(":", ""));
            String name = st.nextToken();
            if (time<=S) hashSet.add(name);
            if (time>=E && time<=Q) {
                if (hashSet.contains(name)) hash.add(name);
            }
            if (time>Q) break;
            line = br.readLine();
        }
        System.out.println(hash.size());
    }
}