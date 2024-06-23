class Solution {
    public int solution(int[][] sizes) {
        int max_w = 0;
        int max_h = 0;

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];
         
            if (w < h) {
                int tmp = w;
                w = h;
                h = tmp;
            }
            max_w = Math.max(max_w, w);
            max_h = Math.max(max_h, h);
        }

        return max_w * max_h;
    }
}