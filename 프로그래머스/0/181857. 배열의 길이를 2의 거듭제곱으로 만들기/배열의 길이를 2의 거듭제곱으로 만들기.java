class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int target = 1;
        while (target < len) {
            target <<= 1; 
        }
        if (target == len) {
            return arr;
        }

        int[] answer = new int[target];
        System.arraycopy(arr, 0, answer, 0, len);
        return answer;
    }
}