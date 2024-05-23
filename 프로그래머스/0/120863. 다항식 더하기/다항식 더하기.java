class Solution {
    public String solution(String polynomial) {
        String answer ="";
        int xc = 0;
        int c = 0;
        String[] poly = polynomial.split(" ");
        for (int i=0; i<poly.length; i=i+2) {
            if (poly[i].contains("x"))
                xc += poly[i].equals("x") ? 1 : Integer.parseInt(poly[i].replace("x", ""));
            else
                c += Integer.parseInt(poly[i]);
        }
        if (xc>0&&c>0)  answer = (xc==1) ? "x + "+c : xc+"x + "+c;
        else if (xc>0) answer = (xc==1) ? "x" : xc+"x";
        else if (c>0) answer = String.valueOf(c);
        
        return answer;
    }
}