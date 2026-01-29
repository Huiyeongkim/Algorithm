import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Deque<Character> stack = new ArrayDeque<>();
        int mul = 1;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
                mul *= 2;
            } else if (c == '[') {
                stack.push(c);
                mul *= 3;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    System.out.println(0);
                    return;
                }
                if (i > 0 && s.charAt(i - 1) == '(') ans += mul;

                stack.pop();
                mul /= 2;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    System.out.println(0);
                    return;
                }
                if (i > 0 && s.charAt(i - 1) == '[') ans += mul;

                stack.pop();
                mul /= 3;
            } else {                
                System.out.println(0);
                return;
            }
        }

        System.out.println(stack.isEmpty() ? ans : 0);
    }
}
