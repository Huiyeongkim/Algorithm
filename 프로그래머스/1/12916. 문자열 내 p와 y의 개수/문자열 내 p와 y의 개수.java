class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int p = 0;
        int y = 0;
        
        for (int i=0; i<s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c=='p') p++;
            if (c=='y') y++;
        }
        if (p==y) answer = true;
        return answer;
    }
}