import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n+"";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        
        String sortedStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedStr += arr[i];
        }
        answer = Long.parseLong(sortedStr);
        return answer;
    }
}