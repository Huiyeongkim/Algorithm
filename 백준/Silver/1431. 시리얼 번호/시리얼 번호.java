import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (arr[j].length() < arr[i].length()) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                if (arr[j].length() == arr[i].length()) {
                    int sum1 = 0;
                    int sum2 = 0;

                    for (int k = 0; k < arr[i].length(); k++) {
                        if (arr[i].charAt(k) >= '0' && arr[i].charAt(k) <= '9') {
                            sum1 += arr[i].charAt(k)-'0';
                        }
                        if (arr[j].charAt(k) >= '0' && arr[j].charAt(k) <= '9') {
                            sum2 += arr[j].charAt(k)-'0';
                        }
                    }
                    if (sum1 > sum2) {
                        String temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                    else if (sum1 == sum2) {
                        if (arr[i].compareTo(arr[j]) > 0) {
                            String temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                        }
                    }
                }
            }
        }

        for (String array : arr)
           System.out.println(array);
    }
}