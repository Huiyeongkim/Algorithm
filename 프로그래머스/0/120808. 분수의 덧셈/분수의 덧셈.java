class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom = denom1*denom2;
        int numer = denom1*numer2+denom2*numer1;
        
        int max = 1;
         for(int i=1; i <= denom && i<= numer; i++){ 
            if(numer%i==0 && denom%i==0){
                max = i;
            }
        }
        answer[1] = denom/max; 
        answer[0] = numer/max;
        return answer;
    }
}