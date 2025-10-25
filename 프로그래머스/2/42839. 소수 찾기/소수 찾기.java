import java.util.*;
class Solution {
    static int len;
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    static char[] arr;
    public int solution(String numbers) {
        int answer = 0;
        len = numbers.length();
        visited = new boolean[len];
        arr = numbers.toCharArray();
    
        DFS(0, "");
        return countPrimes();
    }
    
    private static void DFS(int d, String num) {
        if (!num.isEmpty()) set.add(Integer.parseInt(num));
        if (d == len) return;
        
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                visited[i] = true;
                DFS(d + 1, num + arr[i]);
                visited[i] = false;
            }
        }
    }
    
    private static int countPrimes() {
        int count = 0;
        for (int num : set) {
            if (isPrime(num)) count++;
        }
        return count;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}