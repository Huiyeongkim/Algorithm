import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        List<Integer> coordinates = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            coordinates.add(x);
        }

        List<Integer> sortedCoordinates = new ArrayList<>(coordinates);
        Collections.sort(sortedCoordinates);
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;

        for (int coord : sortedCoordinates) {
            if (!rankMap.containsKey(coord)) {
                rankMap.put(coord, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int coord : coordinates) {
            int compressedValue = rankMap.get(coord);
            sb.append(compressedValue).append(' ');
        }

        System.out.println(sb.toString());
    }
}
