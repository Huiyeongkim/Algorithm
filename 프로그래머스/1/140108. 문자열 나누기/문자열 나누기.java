class Solution {
    public int solution(String s) {
        int answer = 0;
    
        char f = '\0';
        int a = 0;
        int b = 0;
        for (int i=0; i<s.length(); i++) {
            if (f=='\0') {
                f = s.charAt(i);
                a++;
            }
            else {
                char k = s.charAt(i);
                if (k == f) {
                    a++;
                }
                else b++;
                
                if (a == b) {
                    f = '\0';
                    a = 0;
                    b = 0;
                    answer++;
                }
            }
        }
        if (a != 0) {
            answer++;
        }
    
        return answer;
    }
}