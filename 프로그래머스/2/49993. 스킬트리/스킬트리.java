class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
    
        for (String st : skill_trees) {
            int idx = 0;
             boolean valid = true;
            
            for (int i = 0; i < st.length(); i++) {
                char c = st.charAt(i);
                int curr = skill.indexOf(c); 
                
                if (curr != -1) {
                    if (curr != idx) {
                        valid = false;
                        break;
                    } else { 
                        idx++;
                    }
                }
            }
            
            if (valid) answer++;
        }
        return answer;
    }
}