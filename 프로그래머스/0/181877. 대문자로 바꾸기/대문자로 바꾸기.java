class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i=0; i<myString.length(); i++) {
            if (Character.isLowerCase(myString.charAt(i))) {
                answer += Character.toUpperCase(myString.charAt(i));
            }
            else 
                answer += myString.charAt(i);
        }
        return answer;
    }
}