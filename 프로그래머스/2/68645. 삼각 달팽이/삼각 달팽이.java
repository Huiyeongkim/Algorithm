class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int num = 1;
        int row = -1;
        int col = 0;

        for(int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                 if (i % 3 == 0) {     
                    row++;
                } else if (i % 3 == 1) {
                    col++;
                } else {                
                    row--;
                    col--;
                }
                triangle[row][col] = num++;
            }
        }
        int[] answer = new int[num - 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = triangle[i][j];
            }
        }
        return answer;
    }
}