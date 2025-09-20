import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'q') {
                boolean f = false;
                for (int j : map.keySet()) {
                    if (map.get(j).equals("quack")) {
                        map.put(j, "q");
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    map.put(map.size() + 1, "q");
                }
            }
            else if (c == 'u') {
                boolean f = false;
                for (int j : map.keySet()) {
                    if (map.get(j).equals("q")) {
                        map.put(j, "qu");
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    System.out.println(-1);
                    return;
                }
            }
            else if (c == 'a') {
                boolean f = false;
                for (int j : map.keySet()) {
                    if (map.get(j).equals("qu")) {
                        map.put(j, "qua");
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    System.out.println(-1);
                    return;
                }
            }
            else if (c == 'c') {
                boolean f = false;
                for (int j : map.keySet()) {
                    if (map.get(j).equals("qua")) {
                        map.put(j, "quac");
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    System.out.println(-1);
                    return;
                }
            }
            else if (c == 'k') {
                boolean f = false;
                for (int j : map.keySet()) {
                    if (map.get(j).equals("quac")) {
                        map.put(j, "quack");
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    System.out.println(-1);
                    return;
                }
            }
            else {
                System.out.println(-1);
                return;
            }
        }
        for (int i : map.keySet()) {
            if (!map.get(i).equals("quack")) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(map.size());
    }
}