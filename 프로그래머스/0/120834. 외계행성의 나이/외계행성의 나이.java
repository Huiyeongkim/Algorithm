class Solution {
    public String solution(int age) {
        String answer = "";
        String alph = "abcdefghij";
        String[] arr = String.valueOf(age).split("");
        
        for (int i = 0; i < arr.length; i++) {
        	answer += alph.charAt(Integer.valueOf(arr[i]));
		}
        return answer;
    }
}