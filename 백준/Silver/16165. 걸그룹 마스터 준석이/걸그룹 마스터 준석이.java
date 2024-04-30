import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedHashMap<String, String> hashmap = new LinkedHashMap<>();
        for (int i=0; i<N; i++) {
            String name = br.readLine();
            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < num; j++) {
                hashmap.put(br.readLine(), name);
            }
        }

        for (int i=0; i<M; i++) {
            String quiz = br.readLine();
            int type = Integer.parseInt(br.readLine());
            if (type==1) System.out.println(hashmap.get(quiz));
            else if (type==0) {
                List<String> list = new ArrayList<>();
                for (String str : hashmap.keySet()) {
                    if (hashmap.get(str).equals(quiz)) {
                        list.add(str);
                    }
                }
                Collections.sort(list);
                for (String arr : list) {
                    System.out.println(arr);
                }
            }
        }
    }
}