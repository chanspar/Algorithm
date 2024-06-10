#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n, m, tmp;
int d[100004];

int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	cin >> n >> m;

	for (int i = 1; i <= n; i++) {
		cin >> tmp;
		d[i] = d[i - 1] + tmp;
	}
	for (int i = 0; i < m; i++) {
		int a, b;
		cin >> a >> b;
		cout << d[b] - d[a - 1] << "\n";
	}
}