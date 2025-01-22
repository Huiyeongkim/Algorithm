import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<Integer, Integer> map = new TreeMap<>();
        Map<Integer, Integer> lastInTime = new HashMap<>();
        
        for (int i=0; i<records.length; i++) {
            String[] part = records[i].split(" ");
            String[] timePart = part[0].split(":");
            int time = Integer.parseInt(timePart[0]) * 60 + Integer.parseInt(timePart[1]);
            int car = Integer.parseInt(part[1]);
            if (part[2].equals("IN"))
                lastInTime.put(car, time);
            else {
                int inTime = lastInTime.remove(car);
                map.put(car, map.getOrDefault(car, 0) + (time - inTime));
            }
        }
        int end = 23 * 60 + 59;
        for (int car : lastInTime.keySet()) {
            int inTime = lastInTime.get(car);
            map.put(car, map.getOrDefault(car, 0) + (end - inTime));
        }
        
        int[] answer = new int[map.size()];
        int k = 0;
        for (int car : map.keySet()) {
            answer[k] = fees[1];
            int sum = map.get(car);
            if (sum > fees[0]) {
                sum -= fees[0];
                answer[k] += Math.ceil((double) sum / fees[2]) * fees[3];
            }
            k++;
        }
        
        
        return answer;
    }
}