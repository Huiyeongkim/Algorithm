import java.util.Stack;
import java.util.Scanner;

public class Main {
    private static boolean Balance(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '('||ch=='[') stack.push(ch);
            else if (ch == ')' || ch ==']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch==')'&&top !='(')||(ch==']'&&top!='[')) return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            String str = in.nextLine();
            if(str.equals(".")) break;
            if (Balance(str)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
