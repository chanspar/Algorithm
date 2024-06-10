#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;
int d[1004];

int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	cin >> n;

	d[1] = 1;
	d[2] = 2;
	
	for (int i = 3; i <= n; i++) {
		d[i] = (d[i - 1] + d[i - 2]) % 10007;
	}

	cout << d[n] << "\n";
	
}