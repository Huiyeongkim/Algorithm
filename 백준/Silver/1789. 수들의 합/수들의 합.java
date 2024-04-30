import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long S = in.nextLong();
        long sum = 0;
        long i = 1;
        
        while(S>=sum) {
            sum += i;
            i++;
        }
        System.out.println(i-2);
    }
}