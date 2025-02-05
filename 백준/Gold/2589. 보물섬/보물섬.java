import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int n, m;
	static char[][] arr;
	static final int[] dy = {-1, 0, 1, 0};
	static final int[] dx = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];

		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int mx = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 'L') {
					mx = Math.max(mx,go(i , j));
				}
			}
		}
		System.out.println(mx - 1);
	}

	static int go(int y, int x) {
		int[][] visited = new int[n][m];
		Deque<Point> q = new ArrayDeque<>();
		visited[y][x] = 1;
		int ret = 1;
		q.offer(new Point(y,x));
		while (!q.isEmpty()) {
			Point cur = q.poll();
			int curx = cur.x;
			int cury = cur.y;
			for (int i = 0; i < 4; i++) {
				int ny = cury + dy[i];
				int nx = curx + dx[i];
				if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
				if (visited[ny][nx] != 0) continue;
				if (arr[ny][nx] != 'L') continue;
				visited[ny][nx] = visited[cury][curx] + 1;
				ret = visited[ny][nx];
				q.offer(new Point(ny, nx));
			}
		}
		return ret;
	}

	static class Point {
		int x, y;
		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
}
