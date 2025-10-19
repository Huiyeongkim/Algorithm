import java.util.*;
class Solution {
    public String[] solution(String[] files) {
        int n = files.length;
        String[] answer = new String[n];
        String[][] str = new String[n][3];
        
        for (int i=0; i<n; i++) {
            boolean idx = false;
            str[i][0] = "";
            str[i][1] = "";
            str[i][2] = files[i];
            
            for (int j=0; j<files[i].length(); j++) {
                char c = files[i].charAt(j);
                if (!Character.isDigit(c)){
                    if (idx) break; 
                    str[i][0] = str[i][0] + Character.toLowerCase(c);
                } else {
                    str[i][1] = str[i][1] + c;
                    idx = true;
                }
            }
        }
        
        Arrays.sort(str, (a, b) -> {
            int head = a[0].compareToIgnoreCase(b[0]);
            if (head != 0) return head;
            return Integer.parseInt(a[1]) - Integer.parseInt(b[1]);
        });
        for (int i=0; i<n; i++) {
            answer[i] = str[i][2];
        }
        return answer;
    }
}