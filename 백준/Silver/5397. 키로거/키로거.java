import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            LinkedList<Character> left = new LinkedList<>();
            LinkedList<Character> right = new LinkedList<>();

            String arr = br.readLine();
            for (int j=0; j<arr.length(); j++) {
                char ch = arr.charAt(j);
                if (ch=='<') {
                    if(!left.isEmpty()) {
                        right.addFirst(left.removeLast());
                    }
                }
                else if (ch=='>') {
                    if (!right.isEmpty()) {
                        left.addLast(right.removeFirst());
                    }
                }
                else if (ch=='-') {
                    if (!left.isEmpty()) {
                        left.removeLast();
                    }
                }
                else {
                    left.addLast(ch);
                }
            }

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
}
