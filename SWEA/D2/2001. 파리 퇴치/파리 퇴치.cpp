#include <iostream>

using namespace std;

int t;
int maxi;
int a[16][16];

void go(int a[16][16], int m, int n, int sx, int sy) {
	int sum = 0;
	if (sx > n - m || sy > n - m)
		return;
	int x = sx + m, y = sy + m;
	for (int i = sy; i < y; i++) {
		for (int j = sx; j < x; j++) {
			sum += a[i][j];
		}
	}
	if (maxi < sum)
		maxi = sum;

	go(a, m, n, sx + 1, sy);
	go(a, m, n, sx, sy + 1);
}

int main() {
	int order = 1;

	cin >> t;
	while (t--) {
		int n, m;
		fill(&a[0][0], &a[15][16], 0);
		maxi = 0;
		cin >> n >> m;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				cin >> a[i][j];
			}
		}
		go(a, m, n, 0, 0);
		cout << "#" << order << " " << maxi << "\n";
		order++;
	}

	return 0;
}