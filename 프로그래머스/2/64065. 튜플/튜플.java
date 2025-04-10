import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length()-2);
        String[] str = s.split("\\},\\{");
        Arrays.sort(str, (o1, o2) -> o1.length() - o2.length());

        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (String k : str) {
            String[] nums = k.split(",");
            for (String num : nums) {
                int n = Integer.parseInt(num);
                if (!set.contains(n)) {
                    set.add(n);
                    result.add(n);
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}