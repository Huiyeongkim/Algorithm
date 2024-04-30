import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> sta = new Stack<>();
        int N = in.nextInt();
        int start = 0;

        while(N > 0) {
            int value = in.nextInt();
            if(value > start) {
                for(int i = start + 1; i <= value; i++) {
                    sta .push(i);
                    sb.append('+').append('\n');
                }
                start = value;
            }
            else if(sta .peek() != value) {
                System.out.println("NO");
                return;
            }

            sta .pop();
            sb.append('-').append('\n');
            N--;
        }
        System.out.println(sb);
    }
}