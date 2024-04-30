import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> hash = new LinkedHashSet<>();
        while(L-->0) {
            String name = br.readLine();
            if (hash.contains(name)) hash.remove(name);
            hash.add(name);
        }

        Iterator iter = hash.iterator();
        while(iter.hasNext()&&K-->0) {
            bw.write(iter.next()+"\n");
        }
        bw.flush();
    }
}