import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int A, C, G, T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        char[] DNA = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        arr = new int[4];
        int result = 0;
        
        for (int i = 0; i < P; i++) {
            Add(DNA[i]);
        }
        if (isValid()) {
            result++;
        }
        
        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(DNA[i]); 
            Remove(DNA[j]);

            if (isValid()) {
                result++;
            }
        }

        System.out.println(result);
    }
    
    private static boolean isValid() {
        return arr[0] >= A && arr[1] >= C && arr[2] >= G && arr[3] >= T;
    }

    private static void Add(char ch) {
        if (ch == 'A') {
            arr[0]++;
        }
        if (ch == 'C') {
            arr[1]++;
        }
        if (ch == 'G') {
            arr[2]++;
        }
        if (ch == 'T') {
            arr[3]++;
        }
    }

    private static void Remove(char ch) {
        if (ch == 'A') {
            arr[0]--;
        }
        if (ch == 'C') {
            arr[1]--;
        }
        if (ch == 'G') {
            arr[2]--;
        }
        if (ch == 'T') {
            arr[3]--;
        }
    }
}