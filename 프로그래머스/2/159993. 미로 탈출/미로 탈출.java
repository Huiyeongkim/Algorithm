import java.util.*;
class Solution {
    static int n, m;
    static char[][] map;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        map = new char[n][m];

        int sx=0, sy=0, lx=0, ly=0;

        for(int i=0;i<n;i++){
            map[i] = maps[i].toCharArray();
            for(int j=0;j<m;j++){
                if(map[i][j]=='S'){ sx=i; sy=j; }
                if(map[i][j]=='L'){ lx=i; ly=j; }
            }
        }

        int d1 = bfs(sx, sy, 'L');
        if(d1==-1) return -1;

        int d2 = bfs(lx, ly, 'E');
        if(d2==-1) return -1;

        return d1 + d2;
    }

    static int bfs(int sx, int sy, char target){
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{sx, sy, 0});
        visited[sx][sy]=true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int d = cur[2];

            if(map[x][y]==target) return d;

            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];

                if(nx<0||ny<0||nx>=n||ny>=m) continue;
                if(visited[nx][ny]) continue;
                if(map[nx][ny]=='X') continue;

                visited[nx][ny]=true;
                q.add(new int[]{nx,ny,d+1});
            }
        }
        return -1;
    }
}