import java.util.*;
class Solution {
    public String solution(String my_string, String alp) {
        String[] arr = my_string.split("");
        String answer = "";
        for (int i=0; i<my_string.length(); i++) {
            if (arr[i].equals(alp)) {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
            else {
                answer += arr[i];
            }
        }
        return answer;
    }
}