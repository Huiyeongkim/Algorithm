class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for (int i=1; i<arr.length; i++) {
            if (min > Integer.parseInt(arr[i])) min = Integer.parseInt(arr[i]);
            if (max < Integer.parseInt(arr[i])) max = Integer.parseInt(arr[i]);
        }
        String answer = min+" "+max;
        return answer;
    }
}