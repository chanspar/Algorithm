#include <bits/stdc++.h>
using namespace std;

int a[100004];

int checkBinary(int num, int n) {
	int st = 0, end = n - 1, mid;
	while (st <= end) {
		mid = (st + end) / 2;
		if (a[mid] == num) return 1;
		if (a[mid] > num) {
			end = mid - 1;
		}
		else {
			st = mid + 1;
		}
	}
	return 0;
}

int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	int n, m;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}
	sort(a, a + n);
	cin >> m;
	for (int i = 0; i < m; i++) {
		int tmp;
		cin >> tmp;
		cout << checkBinary(tmp, n) << "\n";
	}
}