class Solution {
    public int solution(String s) {
        String answer = "";
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
        for (int i=0; i<s.length(); ) {
            if (s.charAt(i) <='9' && s.charAt(i) >='0') {
                answer += s.charAt(i);
                i++;
            } 
            else {
                for (int j = 0; j < 10; j++) {
                    if (s.startsWith(number[j], i)) {
                        answer += j; 
                        i += number[j].length();
                        break;
                    }
                }
            } 
        }
        
        return Integer.parseInt(answer);
    }
}