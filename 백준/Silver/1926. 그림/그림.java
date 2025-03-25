

import java.util.*;
import java.io.*;

public class Main {
    static int[][] mp;
    static int n, m, ret, mx=0, area;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static boolean[][] visited = new boolean[502][502];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        mp = new int[n][m];
        


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                mp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (visited[i][j] == false && mp[i][j] == 1) {
                    area = 0;
                    ret++;
                    go(i, j);
                    mx = Math.max(area, mx);
                }
            }
        }

        System.out.println(ret);
        System.out.println(mx);


    }

    static void go(int y, int x) {
        visited[y][x] = true;
        area++;

        for (int i = 0; i < 4; i++) {
            int ny = dy[i] + y;
            int nx = x + dx[i];
            if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
            if (visited[ny][nx] == true) continue;
            if (mp[ny][nx] == 0) continue;
            go(ny, nx); 
        }

    }
}
