import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        int i = 0;

        while(true) {
            char a = S.charAt(i);
            char b = S.charAt(i+1);
            i++;
            if (a!=b) count++;
            if (i==S.length()-1) break;
        }
        System.out.println((count+1)/2);
    }
}