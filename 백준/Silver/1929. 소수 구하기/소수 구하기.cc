#include <bits/stdc++.h>
using namespace std;


int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	int m, n;
	cin >> m >> n;

	vector<bool> state(n + 1, false);
	state[1] = true;

	for (int i = 2; i * i <= n; i++) {
		if (state[i]) continue;
		for (int j = i * 2; j <= n; j += i) {
			state[j] = true;
		}
	}

	for (int i = m; i <= n; i++) {
		if (state[i] == false) {
			cout << i << "\n";
		}
	}
	return 0;

}