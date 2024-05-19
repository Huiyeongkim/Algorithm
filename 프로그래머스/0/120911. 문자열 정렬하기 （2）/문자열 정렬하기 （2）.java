import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for (int i=0; i<arr.length; i++) {
            char c = arr[i].charAt(0);
            if (Character.isUpperCase(c)) arr[i] = String.valueOf(Character.toLowerCase(c));
        }
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}