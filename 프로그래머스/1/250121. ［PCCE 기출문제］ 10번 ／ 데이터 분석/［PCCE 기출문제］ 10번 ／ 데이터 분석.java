import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = idx(ext);
        int sortIdx = idx(sort_by);

        List<int[]> filtered = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIdx] < val_ext) {
                filtered.add(row);
            }
        }

        filtered.sort(Comparator.comparingInt(a -> a[sortIdx]));

        int[][] answer = new int[filtered.size()][4];
        for (int i = 0; i < filtered.size(); i++) {
            answer[i] = filtered.get(i);
        }
        return answer;
    }

    private int idx(String key) {
        switch (key) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
            default: throw new IllegalArgumentException("Unknown key: " + key);
        }
    }
}
