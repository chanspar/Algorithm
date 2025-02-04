
import java.io.*;
import java.util.*;

public class Main {
    static int[][] mp;
    static int[][] visited;
    static int dy[] = {-1, 0, 1, 0};
    static int dx[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            mp = new int[n][m];
            visited = new int[n][m];

            for (int i = 0; i < k; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int a1 = Integer.parseInt(st1.nextToken());
                int a2 = Integer.parseInt(st1.nextToken());
                mp[a2][a1] = 1;
            }

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mp[i][j] == 1 && visited[i][j] == 0) {
                        go(i, j, n, m);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }
    }

    static void go(int y, int x, int n, int m) {
        visited[y][x] = 1;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || nx < 0 || ny >=n || nx >= m) continue;
            if (mp[ny][nx] != 1) continue;
            if (visited[ny][nx] != 0) continue;
            go(ny, nx, n , m);
        }
    }
}
