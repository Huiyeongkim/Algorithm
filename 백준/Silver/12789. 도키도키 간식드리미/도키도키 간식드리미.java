import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        int next = 1;
        
        for (int i = 0; i < N; i++) {
            int student = Integer.parseInt(st.nextToken());
            
            while (true) {
                if (student == next) {
                    next++;
                    break;
                } else if (!stack.isEmpty() && stack.peek() == next) {
                    stack.pop();
                    next++;
                } else {
                    stack.push(student);
                    break;
                }
            }
        }
        
        while (!stack.isEmpty() && stack.peek() == next) {
            stack.pop();
            next++;
        }
        
        if (next == N + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}