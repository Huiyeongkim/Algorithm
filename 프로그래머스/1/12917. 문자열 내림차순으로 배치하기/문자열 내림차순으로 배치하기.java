import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        for (int i=s.length()-1; i>=0; i--) {
            answer += charArray[i];
        }
        return answer;
    }
}