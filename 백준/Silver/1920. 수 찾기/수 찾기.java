import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr); 
        
        int M = in.nextInt();
        for (int i = 0; i < M; i++) {
            int b = in.nextInt();
            boolean exists = binarySearch(arr, b);
            if (exists) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
    
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}