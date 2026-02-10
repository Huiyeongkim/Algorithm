import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        int a = 0;
        int b = 0;
        int n = A.length;
        
        while (a < n && b < n) {
            if (A[a] < B[b]) {
                answer++;
                a++;
                b++;
            } else {
                b++;
            }
        }
        
        return answer;
    }
}