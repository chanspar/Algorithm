import java.io.*;
import java.util.*;

public class Main {
	static int n, l, r, sum, cnt;
	static int[][] mp;
	static int[][] visited;
	static boolean end;
	static final int dy[] = {-1, 0, 1, 0};
	static final int dx[] = {0, 1, 0, -1};
	static Deque<Point> q;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		mp = new int[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				mp[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int ret = 0;
		while (end == false) {
			visited = new int[n][n];
			end = true;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum = mp[i][j];
					cnt = 1;
					q = new ArrayDeque<>();
					if (visited[i][j] == 0) {
						go(i, j);
					}
					if (!q.isEmpty() && q.size() > 1) {
						end = false;
						// System.out.println(sum);
						while (!q.isEmpty()) {
							Point cur = q.poll();
							int curx = cur.x;
							int cury = cur.y;
							mp[cury][curx] = sum / cnt;
						}
					}
				}
			}
			ret++;
		}
		System.out.println(ret - 1);

	}


	static void go(int y, int x) {
		visited[y][x] = 1;
		q.offer(new Point(y, x));
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny < 0 || nx < 0 || ny >= n || nx >= n) continue;
			int gap = Math.abs(mp[y][x] - mp[ny][nx]);
			if (visited[ny][nx] == 1) continue;
			if (l <= gap && gap <= r) {
				cnt++;
				sum = sum + mp[ny][nx];
				// q.offer(new Point(ny, nx));
				go(ny, nx);
			}
		}
	}

	static class Point{
		int y, x;
		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
}
