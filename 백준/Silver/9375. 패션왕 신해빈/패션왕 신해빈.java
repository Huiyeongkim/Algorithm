import javax.print.attribute.IntegerSyntax;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            HashMap<String, Integer> hashmap = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            for (int j=0; j<N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String name = st.nextToken();
                if (hashmap.containsKey(name)) hashmap.put(name, hashmap.get(name) + 1);
                else hashmap.put(name, 1);
            }
            int count = 1;
            for (int val : hashmap.values())
                count *= (val+1);
            bw.write(count-1+"\n");
        }
        bw.flush();
    }
}