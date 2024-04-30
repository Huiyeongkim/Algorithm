import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String[] str = new String[S.length()];
        
        for (int i=0; i<S.length(); i++) {
            str[i] = S.substring(i);
        }
        Arrays.sort(str);
        for (String s : str)
            System.out.println(s);
    }
}