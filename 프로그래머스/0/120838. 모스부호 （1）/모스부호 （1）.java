class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] arr = letter.split(" ");

        for (String k : arr) {
            for (int i = 0; i < morse.length; i++) {
                if (k.equals(morse[i])) answer += (char)('a' + i);
            }
        }
        return answer;
    }
}