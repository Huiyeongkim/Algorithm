import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new TreeMap<>();
        for (int i=0; i<s.length(); i++ ){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Character> list = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            if (map.get(s.charAt(i))==1) list.add(s.charAt(i));
        }
        Collections.sort(list);
        for (char a : list) {
            answer += a;
        }
        return answer;
    }
}