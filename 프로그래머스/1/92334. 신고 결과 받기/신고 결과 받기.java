import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> set = new HashSet<>(Arrays.asList(report));
        int[] count = new int[id_list.length];
        for (String r : set) {
            String[] parts = r.split(" ");
            for (int i=0; i<id_list.length; i++) {
                if (parts[1].equals(id_list[i])) {
                    count[i]++; // 신고당한 횟수
                }
            }
        }
        
        
        for (String r : set) {
            String[] parts = r.split(" ");
            for (int i=0; i<id_list.length; i++) {
                if (parts[1].equals(id_list[i]) && count[i] >= k) {
                    for (int j=0; j<id_list.length; j++) {
                        if (parts[0].equals(id_list[j])) {
                            answer[j]++;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}