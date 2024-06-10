#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;
int d[1004][4], s[1004][4];

int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	cin >> n;

	for (int i = 1; i <= n; i++) {
		cin >> s[i][1] >> s[i][2] >> s[i][3];
	}
	d[1][1] = s[1][1];
	d[1][2] = s[1][2];
	d[1][3] = s[1][3];

	for (int i = 2; i <= n; i++) {
		d[i][1] = min(d[i - 1][2], d[i - 1][3]) + s[i][1];
		d[i][2] = min(d[i - 1][1], d[i - 1][3]) + s[i][2];
		d[i][3] = min(d[i - 1][1], d[i - 1][2]) + s[i][3];
	}
	
	cout << min(min(d[n][1], d[n][2]), d[n][3]) << "\n";
	
}