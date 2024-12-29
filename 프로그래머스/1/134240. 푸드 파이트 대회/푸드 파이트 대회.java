class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i=1; i<food.length; i++) {
            int k = food[i]/2;
            while(k-->0) {
                answer += i+"";
            }
        }
        answer += 0+"";
        for (int i=food.length-1; i>=1; i--) {
            int k = food[i]/2;
            while(k-->0) {
                answer += i+"";
            }
        }
        return answer;
    }
}