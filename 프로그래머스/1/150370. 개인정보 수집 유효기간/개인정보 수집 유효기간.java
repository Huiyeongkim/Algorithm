import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String pair : terms) {
            String[] str = pair.split(" ");
            map.put(str[0], Integer.parseInt(str[1]));
        }

        int date = calculate(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] str = privacies[i].split(" ");
            int type = map.get(str[1]);
            int expiry = calculate(str[0]) + type * 28 - 1;

            if (date > expiry) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        int k = 0;
        for (int i : list) {
            answer[k++] = i;
        }
        return answer;
    }
    
    private int calculate(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return year * 12 * 28 + month * 28 + day;
    }
}