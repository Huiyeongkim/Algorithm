class Solution {
    static int[] arr;
    static int t;
    static int answer;

    public int solution(int[] numbers, int target) {
        arr = numbers;
        t = target;
        answer = 0;
        DFS(0, 0);
        return answer;
    }
    private static void DFS(int L, int sum) {
        if (L==arr.length) {
            if (sum == t) answer++;
            return;
        }
        
        DFS(L+1, sum+arr[L]);
        DFS(L+1, sum-arr[L]);
        return;
    }
}