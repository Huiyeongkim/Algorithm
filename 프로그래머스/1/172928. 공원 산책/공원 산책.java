class Solution {
    public int[] solution(String[] park, String[] routes) {

        int h = park.length;
        int w = park[0].length();
    
        String[][] arr = new String[h][w];
        int x = 0;
        int y = 0;
        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                String s = park[i].charAt(j)+"";
                arr[i][j] = s;
                if (s.equals("S")) {
                    x = i;
                    y = j;
                }
            }
        }
        
        for (int i=0; i<routes.length; i++) {
            String[] str = routes[i].split(" ");
            String dir = str[0];
            int num = Integer.parseInt(str[1]);
            
            if (dir.equals("E")) {
                boolean b = true;
                
                if (y+num >= w) b = false;
                for (int j=0; j<=num; j++) {
                    if (y+j < w && arr[x][y+j].equals("X")) {
                        b = false;
                        break;
                    }
                }
                
                if (b) y += num;
            }
            else if (dir.equals("S")) {
                boolean b = true;
                
                if (x+num >= h) b = false;
                for (int j=0; j<=num; j++) {
                    if (x+j < h && arr[x+j][y].equals("X")) {
                        b = false;
                        break;
                    }
                }
                
                if (b) x += num;
            }
            else if (dir.equals("W")) {
                boolean b = true;
                
                if (y-num < 0) b = false;
                for (int j=0; j<=num; j++) {
                    if (y-j >=0 && arr[x][y-j].equals("X")) {
                        b = false;
                        break;
                    }
                }
                
                if (b) y -= num;
            }
            else if (dir.equals("N")) {
                boolean b = true;
                
                if (x-num < 0) b = false;
                for (int j=0; j<=num; j++) {
                    if (x-j >=0 && arr[x-j][y].equals("X")) {
                        b = false;
                        break;
                    }
                }
                
                if (b) x -= num;
            }
        }
        return new int[]{x, y};
    }
}