import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int k = 0; k < commands.length; k++) {
            int start = commands[k][0]-1;
            int end = commands[k][1]-1;
            int[] Arr = new int[end-start+1];
            int j=0;
            for (int i=start; i<=end ; i++){
                Arr[j++] = array[i];
            }
            Arrays.sort(Arr);
            answer[k] = Arr[commands[k][2]-1];
           
        }
    
        return answer;
    }
}