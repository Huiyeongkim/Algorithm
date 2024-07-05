class Solution {
    public long solution(long n) {
        double a = Math.sqrt(n);
        if (a%1!=0) return -1;
        return (long)((a+1)*(a+1));
    }
}