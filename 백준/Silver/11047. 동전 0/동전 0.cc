#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n, k;
int coin[12];

int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	int idx = 0, ret = 0;
	cin >> n >> k;
	for (int i = 1; i <= n; i++) {
		cin >> coin[i];
		if (k >= coin[i]) idx = i;
	}
	while (1) {
		if (k < coin[idx]) {
			idx--;
			continue;
		}
		int a = k / coin[idx];
		ret += a;
		k = k - (coin[idx] * a);
		if (k == 0) break;
		idx--;

	}
	cout << ret << "\n";

}