import java.util.Stack;
import java.util.Scanner;

public class Main {
    private static boolean Balance(String str) {
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (!stack.isEmpty()&&stack.peek() == ch) stack.pop();
            else stack.push(ch);
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        int count = 0;
        for (int i=0; i<N; i++) {
            String str = in.nextLine();

            if (Balance(str)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
