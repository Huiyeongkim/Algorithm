class Solution {
    public int solution(int num, int k) {
        String number = Integer.toString(num);
        String[] array = number.split("");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(Integer.toString(k))) {
                return i+1;
            }
        }
        return -1;
    }
}