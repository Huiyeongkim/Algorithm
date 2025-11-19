import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        StringBuilder result = new StringBuilder();
        StringBuilder buffer = new StringBuilder();
        boolean inTag = false;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '<') {
                result.append(buffer.reverse());
                buffer.setLength(0);
                
                inTag = true;
                result.append(c);
            }
            else if (c == '>') {
                inTag = false;
                result.append(c);
            }
            else if (inTag) {
                result.append(c);
            }
            else {
                if (c == ' ') {
                    result.append(buffer.reverse());
                    buffer.setLength(0);
                    result.append(' ');
                } else {
                    buffer.append(c);
                }
            }
        }

        result.append(buffer.reverse());
        System.out.println(result);
    }
}
