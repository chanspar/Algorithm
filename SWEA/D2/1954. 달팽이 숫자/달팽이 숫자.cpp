#include <iostream>
using namespace std;

int a[10][10];
const int dx[] = { 1, 0, -1 ,0 };
const int dy[] = { 0, 1, 0, -1 };

int main() {
	int t;
	cin >> t;
	for (int i = 0; i < t; i++) {
		int n, x=0, y=0, dir = 0, value = 2;
		fill(&a[0][0], &a[9][10], 0);
		cin >> n;
		a[0][0] = 1;
		while (value <= n * n) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];
			if (nx < 0 || ny < 0 || nx >= n || ny >= n || a[ny][nx]) {
				dir++;
				if (dir == 4)
					dir = 0;
				continue;
			}
			x = nx;
			y = ny;
			a[ny][nx] = value;
			value++;
		}

		cout << "#" << i + 1 << "\n";
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				cout << a[j][k] << " ";
			}
			cout << "\n";
		}
	}

	return 0;
}