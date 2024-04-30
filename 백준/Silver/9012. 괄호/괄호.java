import java.util.Stack;
import java.util.Scanner;

public class Main {
    private static boolean Balance(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') stack.push(ch);
            else if (ch == ')') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (top!='(') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int i=0; i<T; i++) {
            String str = in.nextLine();

            if (Balance(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
