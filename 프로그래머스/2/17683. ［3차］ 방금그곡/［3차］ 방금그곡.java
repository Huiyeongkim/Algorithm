import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int max = 0;
        m = func(m);
        
        for (String s : musicinfos) {
            String[] str = s.split(",");
            int len = length(str[0], str[1]);
            String song = func(str[3]);
            while(song.length() < len) {
                song += func(str[3]);
            }
            
            if (song.length() > len) song = song.substring(0, len);
            
            if (song.contains(m) && len > max) {
                max = len;
                answer = str[2]; 
            }
        }
        return answer;
    }
    private int length(String a, String b) {
        String[] aArr = a.split(":");
        String[] bArr = b.split(":");
        return (Integer.parseInt(bArr[0]) - Integer.parseInt(aArr[0])) * 60 + Integer.parseInt(bArr[1]) - Integer.parseInt(aArr[1]);
    }
    
    private String func(String s) {
        return s.replace("C#", "c")
                .replace("D#", "d")
                .replace("F#", "f")
                .replace("G#", "g")
                .replace("A#", "a")
                .replace("B#", "b");
    }
}