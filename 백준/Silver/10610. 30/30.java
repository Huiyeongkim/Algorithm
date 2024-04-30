import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        
        char[] dig = N.toCharArray();
        Arrays.sort(dig);
        int length = dig.length;
        int sum  = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = length-1; i >= 0; i--) {
            int num = dig[i] - '0';
            sum += num;
            sb.append(num);
        }

        if(dig[0]!='0'||sum%3!=0) {
            System.out.println("-1");
            return;
        }

        System.out.println(sb.toString());
    }
}
