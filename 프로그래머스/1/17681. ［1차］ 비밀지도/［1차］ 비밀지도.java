class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] s1 = new String[n];
        String[] s2 = new String[n];
        for (int i=0; i<n; i++) {
            s1[i] = binary(arr1[i], n);
            s2[i] = binary(arr2[i], n);
        }
        
        for (int i=0; i<n; i++) {
            answer[i] = "";
            for (int j=0; j<n; j++) {
                
                if (s1[i].charAt(j)=='1' || s2[i].charAt(j)=='1') {
                    answer[i] += "#";
                }
                else 
                    answer[i] += " ";
            }
        }
        return answer;
    }
    private String binary(int num, int n) {
        String str = "";
        while(num>0) {
            if (num%2==0) {
                str = "0" + str;
            }
            else 
                str = "1" + str;
            num /=2;
        }
        while (str.length() != n) {
            str = "0" + str;
        }
        return str;
    }
}