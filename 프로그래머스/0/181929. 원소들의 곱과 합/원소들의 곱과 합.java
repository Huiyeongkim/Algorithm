class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        for (int i : num_list) {
            sum += i;
            multiply *= i;
        }
        if (sum*sum > multiply) return 1;
        else
            return 0;
    }
}