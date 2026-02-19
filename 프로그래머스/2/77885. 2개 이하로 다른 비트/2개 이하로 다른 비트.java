import java.util.*;
class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            long x = numbers[i];
            if ((x&1L)==0L) answer[i] = x+1;
            else {
                long k = (~x) & (x+1);
                answer[i] = x + k - (k>>1);
            }
        }
        return answer;
    }
}