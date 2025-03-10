import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = sieve(n);
        for (int i=1; i<=n; i++) {
            if (arr[i]) answer++;
        }
        return answer;
    }
    private static boolean[] sieve(int n) {
	    boolean[] isPrime = new boolean[n + 1];
	    Arrays.fill(isPrime, true); 
	    isPrime[0] = isPrime[1] = false; 

	    for (int i = 2; i * i <= n; i++) {
		    if (isPrime[i]) { 
			    for (int j = i * i; j <= n; j += i) {
				    isPrime[j] = false;
                }
            }
	    }
	    return isPrime;
    }
}