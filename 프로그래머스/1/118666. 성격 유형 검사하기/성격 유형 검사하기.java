import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        List<String> list = new ArrayList<>();
        for (int i=0; i<choices.length; i++) {
            String a = survey[i].charAt(0)+"";
            String b = survey[i].charAt(1)+"";
            
            if (choices[i] == 7) {
                list.add(b); 
                list.add(b);
                list.add(b);
            }
            else if (choices[i] == 6) {
                list.add(b); 
                list.add(b);
            }
            else if (choices[i] == 5) {
                list.add(b); 
            }
            else if (choices[i] == 3) {
                list.add(a);
            }
            else if (choices[i] == 2) { 
                list.add(a);
                list.add(a);
            }
            else if (choices[i] == 1) {
                list.add(a);
                list.add(a);
                list.add(a);
            }
        }
        
        int num1 = 0;
        int num2 = 0;
        String first = "";
        for (String s : list) {
            if (s.equals("R") || s.equals("T")) {
                if (s.equals("R")) num1++;
                else if (s.equals("T")) num2++;
            }
        }
        if (num1 >= num2) answer+="R";
        else answer+="T";
        
        num1 = 0;
        num2 = 0;
        first = "";
        for (String s : list) {
            if (s.equals("C") || s.equals("F")) {
                if (s.equals("C")) num1++;
                else if (s.equals("F")) num2++;
            }
        }
        if (num1 >= num2) answer+="C";
        else answer+="F";
        
        num1 = 0;
        num2 = 0;
        first = "";
        for (String s : list) {
            if (s.equals("J") || s.equals("M")) {
                if (s.equals("J")) num1++;
                else if (s.equals("M")) num2++;
            }
        }
        if (num1 >= num2) answer+="J";
        else answer+="M";
        
        num1 = 0;
        num2 = 0;
        first = "";
        for (String s : list) {
            if (s.equals("A") || s.equals("N")) {
                if (s.equals("A")) num1++;
                else if (s.equals("N")) num2++;
            }
        }
        if (num1 >= num2) answer+="A";
        else answer+="N";
        
    
        return answer;
    }
}