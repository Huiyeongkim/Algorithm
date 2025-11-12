import java.util.*;
class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> alphabet = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            alphabet.put((char) (i - 1 + 'A') + "", i);
        }

        List<Integer> list = new ArrayList<>();
        int nextIndex = 27; 
        int i = 0;

        while (i < msg.length()) {
            String w = msg.charAt(i) + "";
            int j = i + 1;

            while(j <= msg.length() && alphabet.containsKey(msg.substring(i, j))) {
                w = msg.substring(i, j);
                j++;
            }
            
            list.add(alphabet.get(w));
            
            if (j <= msg.length()) {
                String wc = msg.substring(i, j);
                alphabet.put(wc, nextIndex++);
            }
            i += w.length();
        }

        int[] answer = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }

        return answer;
    }
}