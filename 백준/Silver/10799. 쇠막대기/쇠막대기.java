import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<String> stack = new Stack<>();
        int answer = 0;

        String prev = null;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.add("(");
                prev = "(";
                continue;
            }

            if (prev != null && prev.equals("(")) {
                prev = ")";
                stack.pop();
                answer += stack.size();
                continue;
            }

            prev = ")";
            answer++;
            stack.pop();
        }
        System.out.println(answer);
    }
}
