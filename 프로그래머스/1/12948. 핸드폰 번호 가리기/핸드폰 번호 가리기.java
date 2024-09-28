class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int count = 0;
        for (int i=phone_number.length()-1; i>=0; i--) {
            if (count>3) {
                answer = "*"+answer;
            }
            else {
                answer = phone_number.charAt(i) + answer;
                count++;
            }
        }
        return answer;
    }
}