class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int conversion = 0;
        while(true) {
            if (s.equals("1")) break;
            conversion++;
            int original = s.length();
            s = s.replace("0","");
            int length = s.length();
            count+=(original-length);
            s = "";
            while(length>=1) {
                if (length%2==0) {
                    s += "0";
                }
                else {
                    s += "1";
                }
                length /= 2;
            }
        }   
        answer[0] = conversion;
        answer[1] = count;
        
        return answer;
    }
}