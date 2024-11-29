class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i=0; i<myString.length(); i++) {
            if ('a'==myString.charAt(i)) {
                answer += Character.toUpperCase(myString.charAt(i));
            }
            else if ('A'==myString.charAt(i))
                answer += 'A';
            else
                answer += Character.toLowerCase(myString.charAt(i));
        }
        return answer;
    }
}