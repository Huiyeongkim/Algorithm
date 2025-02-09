class Solution {
    public String solution(String new_id) {
        String answer = "";
        new_id = new_id.toLowerCase();
        
        for (char c : new_id.toCharArray()) {
            if (Character.isLowerCase(c) || Character.isDigit(c) || c == '-' || c == '_' || c == '.') {
                answer += c;
            }
        }
        answer = answer.replaceAll("\\.{2,}", ".");
        
        if (answer.length() != 0 && answer.charAt(0) =='.') answer = answer.substring(1);
        if (answer.length() != 0 && answer.charAt(answer.length()-1) == '.') answer = answer.substring(0, answer.length()-1);
        
        if (answer.length() == 0) answer = "a";
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length()-1) == '.') answer = answer.substring(0, 14);
        }
        if (answer.length() <= 2) {
            char c = answer.charAt(answer.length()-1);
            while(answer.length() < 3) {
                answer += c;
            }
        }
        return answer;
    }
}