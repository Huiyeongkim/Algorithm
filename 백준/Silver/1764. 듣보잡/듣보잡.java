import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        Set<String> noHear = new HashSet<>();
        Set<String> noSee = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();
            noHear.add(name);
        }

        for (int i = 0; i < M; i++) {
            String name = scanner.nextLine();
            noSee.add(name);
        }

        List<String> noHearNoSee = new ArrayList<>();
        for (String name : noHear) {
            if (noSee.contains(name)) {
                noHearNoSee.add(name);
            }
        }

        Collections.sort(noHearNoSee);
        System.out.println(noHearNoSee.size());
        for (String name : noHearNoSee) {
            System.out.println(name);
        }
    }
}