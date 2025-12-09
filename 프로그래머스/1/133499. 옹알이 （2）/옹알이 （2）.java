class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String s : babbling) {
            boolean valid = true;
            String prev = "";

            while (!s.isEmpty()) {
                boolean matched = false;

                for (String w : words) {
                    if (s.startsWith(w) && !w.equals(prev)) {  
                        s = s.substring(w.length());
                        prev = w; 
                        matched = true;
                        break;
                    }
                }

                if (!matched) {
                    valid = false;
                    break;
                }
            }

            if (valid) answer++;
        }

        return answer;
    }
}