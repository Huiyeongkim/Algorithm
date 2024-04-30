import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        if (N%2==1) System.out.println("SK");
        else
            System.out.println("CY");

    }
}
