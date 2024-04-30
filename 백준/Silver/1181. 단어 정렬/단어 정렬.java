import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.nextLine());
        Set<String> words = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }
        
        List<String> sortedWords = new ArrayList<>(words);
        
      
        Collections.sort(sortedWords, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return Integer.compare(a.length(), b.length());
            }
        });
        
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }
}