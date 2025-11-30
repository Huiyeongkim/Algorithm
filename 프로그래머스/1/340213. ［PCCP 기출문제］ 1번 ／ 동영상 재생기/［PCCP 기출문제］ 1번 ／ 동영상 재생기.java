class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        int start = convert(op_start);
        int end = convert(op_end);
        int len = convert(video_len);
        
        int p = convert(pos);
        if (p<=end && p>=start) p = end;
        
        for (String command : commands) {
            if (command.equals("next")) {
                p += 10;
                if (p >= len) p = len;
                if (p <= end && p >= start) p = end;
            }
            else if (command.equals("prev")) {
                p -= 10;
                if (p <= 0) p = 0;
                if (p <= end && p >= start) p = end;
            }
        }
        
        return String.format("%02d:%02d", p/60, p%60);
    }
    
    private static int convert(String s) {
        String[] str = s.split(":");
        if (str[0].equals("00")) return Integer.parseInt(str[1]);
        return Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
    }
}