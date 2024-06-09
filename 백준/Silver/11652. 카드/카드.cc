#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

map<ll, int> mp;
int mx = -1;
ll ret = 0;

int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	int n;

	cin >> n;
	for (int i = 0; i < n; i++) {
		ll num;
		cin >> num;
		mp[num]++;
	}
	for (auto i : mp) {
		if (i.second > mx) {
			mx = i.second;
			ret = i.first;
		}
	}
	
	cout << ret << "\n";
	
}