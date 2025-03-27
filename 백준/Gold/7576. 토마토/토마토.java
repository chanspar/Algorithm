

import java.io.*;
import java.util.*;

public class Main {
    static int m, n, mx;
    static int[][] mp;
    static int[][] visited = new int[1002][1002];
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        mp = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                mp[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        Deque<Point> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mp[i][j] == 1) {
                    q.offer(new Point(i, j));
                    visited[i][j] = 1;
                }
            }
        }


        while (!q.isEmpty()) {
            Point p = q.poll();
            int y = p.y;
            int x = p.x;
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
                if (visited[ny][nx] > 0) continue;
                if (mp[ny][nx] == -1) continue;
                q.offer(new Point(ny, nx));
                visited[ny][nx] = visited[y][x] + 1;
                mx = Math.max(mx, visited[ny][nx] - 1);
            }

        }


        if (checkTomato() == false) {
            System.out.println(-1);
        } else {
            System.out.println(mx);
        }
        
    }

    static boolean checkTomato() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mp[i][j] != -1 && visited[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    static class Point {
        int y, x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
