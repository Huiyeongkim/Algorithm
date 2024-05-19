class Solution {
    public String[] solution(String my_str, int n) {
        int length = (my_str.length()-1)/n+1;
        String[] answer = new String[length];
        for (int i=0; i<length; i++) {
            int start = i*n;
            int end = 0;
            
            if(start + n >= my_str.length()){
                end = my_str.length();
            } 
            else {
                end = start + n;
            }
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}