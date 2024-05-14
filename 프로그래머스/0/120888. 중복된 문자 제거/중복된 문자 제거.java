import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<Character> list = new ArrayList<>();
        for (int i=0; i<my_string.length(); i++) {
            if (!list.contains(my_string.charAt(i)))
                list.add(my_string.charAt(i));
        
        }
        for (char c : list) {
            answer += c;
        }
        return answer;
    }
}