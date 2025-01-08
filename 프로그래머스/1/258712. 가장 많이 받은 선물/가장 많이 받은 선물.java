import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[] answerArr = new int[friends.length];
        int[][] arr = new int[friends.length][friends.length];
        int[][] count = new int[friends.length][friends.length];

        for (String gift : gifts) {
            String[] str = gift.split(" ");
            for (int j = 0; j < friends.length; j++) {
                if (str[0].equals(friends[j])) {
                    for (int k = 0; k < friends.length; k++) {
                        if (str[1].equals(friends[k])) {
                            arr[j][k]++;
                            count[j][0]++;
                            count[k][1]++;
                        }
                    }
                }
            }
        }

         for (int i=0; i<friends.length; i++) {
            for (int j=0; j<friends.length; j++) {
                if (arr[i][j] > arr[j][i] && (arr[i][j] !=0 || arr[j][i]!=0)) {
                    answerArr[i]++;
                }
                else if (arr[i][j] == arr[j][i] || (arr[i][j]==0 && arr[j][i]==0)){
                    int countA = count[i][0]-count[i][1];
                    int countB = count[j][0]-count[j][1];

                    if (countA > countB) {
                        answerArr[i]++;
                    }
                }
            }
        }

        Arrays.sort(answerArr);
        answer = answerArr[answerArr.length-1];
        return answer;
    }
}