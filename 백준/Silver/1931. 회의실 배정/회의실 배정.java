import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count = 0;

        int[][] time = new int[N][2];
        for (int i=0; i<N; i++) {
            time[i][0] = in.nextInt();
            time[i][1] = in.nextInt();
        }
        Arrays.sort(time, (o1, o2) -> {
            if (o1[1]==o2[1]) return o1[0]-o2[0];
            return o1[1]-o2[1];
        });

        int endTime = 0;
        for (int i=0; i<N; i++) {
            if (endTime <= time[i][0]) {
                endTime = time[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
