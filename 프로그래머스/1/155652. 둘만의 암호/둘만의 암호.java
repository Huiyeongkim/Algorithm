import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> set = new HashSet<>();
        for (char c : skip.toCharArray()) {
            set.add(c);
        }

        StringBuilder answer = new StringBuilder();

        for (char c : s.toCharArray()) {
            int cnt = 0;
            char cur = c;

            while (cnt < index) {
                cur++;
                if (cur > 'z') cur = 'a';

                if (!set.contains(cur)) {
                    cnt++;
                }
            }
            answer.append(cur);
        }
        return answer.toString();
    }
}