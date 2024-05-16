import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> list = new ArrayList<>();
        for (int i=0; i<s1.length; i++) {
            list.add(s1[i]);
        }
        
        for (int i=0; i<s2.length; i++) {
            if (list.contains(s2[i])) answer++;
        }
        return answer;
    }
}