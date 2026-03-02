import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] words = line.split(" ");
            boolean assigned = false;

            for (int j = 0; j < words.length; j++) {
                char c = Character.toLowerCase(words[j].charAt(0));

                if (!set.contains(c)) {
                    set.add(c);
                    words[j] = "[" + words[j].charAt(0) + "]" + words[j].substring(1);
                    assigned = true;
                    break;
                }
            }


            if (!assigned) {
                for (int j = 0; j < line.length(); j++) {
                    char c = line.charAt(j);

                    if (c != ' ' && !set.contains(Character.toLowerCase(c))) {
                        set.add(Character.toLowerCase(c));
                        line = line.substring(0, j) + "[" + c + "]" + line.substring(j + 1);
                        assigned = true;
                        break;
                    }
                }
                sb.append(line).append("\n");
            } else {
                sb.append(String.join(" ", words)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
