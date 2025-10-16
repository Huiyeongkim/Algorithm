import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static String str;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            str = br.readLine();
            if (func(0, str.length() - 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean func(int start, int end) {
        if (start >= end) return true;
        int mid = (start + end) / 2;
        for (int i = start; i < mid; i++) {
            if (str.charAt(i) == str.charAt(end - i)) {
                return false;
            }
        }
        return func(start, mid - 1) && func(mid + 1, end);
    }
}
