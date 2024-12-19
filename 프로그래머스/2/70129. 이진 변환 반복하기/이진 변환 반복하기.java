class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int conversion = 0;
        while(!s.equals("1")) {
            conversion++;
            int originalLength = s.length();
            s = s.replace("0", "");
            int newLength = s.length();
            count += (originalLength - newLength);
            s = "";
            while(newLength>=1) {
                if (newLength%2==0) {
                    s += "0";
                }
                else {
                    s += "1";
                }
                newLength /= 2;
            }
        }
        answer[0] = conversion;
        answer[1] = count;
        
        return answer;
    }
}