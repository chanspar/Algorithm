#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;
string num;
vector<ll> v;



int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> num;
		reverse(num.begin(), num.end());
		ll tmp = atoll(num.c_str());
		v.push_back(tmp);
	}
	sort(v.begin(), v.end());
	for (ll i : v) {
		cout << i << "\n";
	}
	return 0;
}