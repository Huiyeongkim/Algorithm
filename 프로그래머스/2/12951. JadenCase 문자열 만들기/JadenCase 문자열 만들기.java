class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length() > 0) {
                if (Character.isLowerCase(arr[i].charAt(0)))
                    answer += Character.toUpperCase(arr[i].charAt(0));
                else 
                    answer += arr[i].charAt(0);
                for (int j=1; j<arr[i].length(); j++) {
                    if (Character.isUpperCase(arr[i].charAt(j))) 
                        answer += Character.toLowerCase(arr[i].charAt(j));
                    else
                        answer += arr[i].charAt(j);
                }
            }
            if (i!=arr.length-1) answer += " ";
        }
    
        return answer;
    }
}
