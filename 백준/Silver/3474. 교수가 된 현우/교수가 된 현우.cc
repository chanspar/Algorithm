#include <bits/stdc++.h>
using namespace std;

int main() {
	cin.tie(NULL); cout.tie(NULL);
	ios_base::sync_with_stdio(false);
	int t, n;

	cin >> t;
	while (t--) {
		int cnt2 = 0, cnt5 = 0;

		cin >> n;
		for (int i = 2; i <= n; i *= 2) {
			cnt2 += n / i;
		}

		for (int i = 5; i <= n; i *= 5) {
			cnt5 += n / i;
		}
		
		cout << min(cnt2, cnt5) << "\n";
	}
	return 0;
}