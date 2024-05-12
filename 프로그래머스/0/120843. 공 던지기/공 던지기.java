class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int a = (k-1)*2;
        a = a%numbers.length;
        return answer=numbers[a];
    }
}