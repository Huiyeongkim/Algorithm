import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        int[] arr = new int[10];

        for (int i=0; i<N.length(); i++) {
            int num = Character.getNumericValue(N.charAt(i));
            arr[num]++;
        }
        
        int result = (arr[6]+arr[9]+1)/2;
        for (int i=0; i<10; i++) {
            if (i==6||i==9) continue;
            result = Math.max(result, arr[i]);
        }
        System.out.println(result);
    }
}