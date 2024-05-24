class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int k = 0;

        for (int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c>='0'&&c<='9')  {
                k = c-'0' + k*10;   
                if (i == my_string.length() - 1) {
                    answer += k;
                }
            }
            else {
                answer += k;
                k = 0;
            }
        }
        return answer;
    }
}