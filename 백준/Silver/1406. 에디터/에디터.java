import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> left = new LinkedList<>();
        LinkedList<Character> right = new LinkedList<>();

        String arr = br.readLine();
        for (int i = 0; i < arr.length(); i++) {
            left.add(arr.charAt(i));
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            if (input.equals("L")) {
                if (!left.isEmpty()) {
                    right.addFirst(left.removeLast());
                }
            } else if (input.equals("D")) {
                if (!right.isEmpty()) {
                    left.addLast(right.removeFirst());
                }
            } else if (input.equals("B")) {
                if (!left.isEmpty()) {
                    left.removeLast();
                }
            } else if (input.equals("P")) {
                char c = st.nextToken().charAt(0);
                left.addLast(c);
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (Character ch : left) {
            sb.append(ch);
        }
        for (Character ch : right) {
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
