class Solution {
    public long solution(int w, int h) {
        long W = (long) w;
        long H = (long) h;
        long answer = 1;

        for (long i = 2; i <= Math.min(W, H); i++) {
            if (W % i == 0 && H % i == 0) {
                answer = i;
            }
        }

        return W * H - (W + H - answer);
    }
}