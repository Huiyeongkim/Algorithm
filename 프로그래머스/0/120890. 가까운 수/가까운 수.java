import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int k = n - array[0];
        for (int i=0; i<array.length; i++) {
            int a = 0;
            if (n>array[i]) a = n - array[i];
            else
                a = array[i]-n;
            if (a < k) {
                k = a;
                answer = array[i];
            }
        }
        return answer;
    }
}