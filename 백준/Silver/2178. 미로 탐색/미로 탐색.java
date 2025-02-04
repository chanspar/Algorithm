
import java.util.*;
import java.io.*;

public class Main {
    static int[][] mp;
    static int[][] visited;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    static class Point {
        int y, x;
        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        mp = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            // StringTokenizer st1 = new StringTokenizer(br.readLine());
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                mp[i][j] = s.charAt(j) - '0';
            }
        }

        Deque<Point> q = new ArrayDeque<>();
        q.offer(new Point(0, 0));
        visited[0][0] = 1;
        while (!q.isEmpty()) {
            Point cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
                if (visited[ny][nx] != 0) continue;
                if (mp[ny][nx] != 1) continue;
                visited[ny][nx] = visited[y][x] + 1;
                q.offer(new Point(ny, nx));
            }
        }
        System.out.println(visited[n - 1][m - 1]);

    }
}
