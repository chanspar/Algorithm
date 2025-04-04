

import java.io.*;
import java.util.*;

public class Main {
    static int m,n,k;
    static int[][] mp;
    static int[][] visited;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            mp = new int[n][m];
            visited = new int[n][m];
            for (int i = 0; i < n; i++) {
                Arrays.fill(visited[i], 0);
                Arrays.fill(mp[i], 0);
            }

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                mp[b][a] = 1;
            }

            int ret = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (visited[i][j] == 0 && mp[i][j] == 1) {
                        dfs(i, j);
                        ret++;
                    }
                }
            }

            System.out.println(ret);
        }
    }

    static void dfs(int y, int x) {
        visited[y][x] = 1;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
            if (visited[ny][nx] == 1) continue;
            if (mp[ny][nx] == 1) {
                dfs(ny, nx);
            }
        }
    }
}
