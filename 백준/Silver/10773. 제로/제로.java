import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        int K = scanner.nextInt();
        for (int i = 0; i < K; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                if (!numbers.isEmpty()) {
                    int lastNum = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    sum -= lastNum;
                }
            } else {
                numbers.add(num);
                sum += num;
            }
        }
        System.out.println(sum);
    }
}