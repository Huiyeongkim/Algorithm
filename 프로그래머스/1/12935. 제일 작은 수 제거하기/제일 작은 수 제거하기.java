class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        }
        
        answer = new int[arr.length-1];
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        int k =0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == min) continue;
            else {
                answer[k++] = arr[i];
            }
        }
        return answer;
    }
}