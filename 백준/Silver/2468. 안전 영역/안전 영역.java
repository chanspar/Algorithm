

import java.util.*;
import java.io.*;

public class Main {
    static final int[] dy = {-1, 0, 1, 0};
    static final int[] dx = {0, 1, 0, -1};
    static int[][] mp;
    static int[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        mp = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                mp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int mx = 0;
        for (int i = 0; i <= 100; i++) {
            visited = new int[n][n];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (mp[j][k] > i &&  visited[j][k] == 0) {
                        cnt++;
                        go(j,k,n,i);
                    }
                }
            }
            mx = Math.max(mx, cnt);
            if (cnt == 0) {
                break;
            }
        }
        System.out.println(mx);


    }

    static void go(int y, int x, int n, int height) {
        visited[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || nx < 0 || ny >= n || nx >= n) continue;
            if (visited[ny][nx] != 0) continue;
            if (mp[ny][nx] <= height) continue;
            go(ny,nx,n,height);
        }
    }
}
