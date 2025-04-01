#include <bits/stdc++.h>
using namespace std;

bool cmp(string &a, string &b) {
	int anum = 0, bnum = 0;
	if (a.size() != b.size()) return a.size() < b.size();
	for (size_t i = 0; i < a.size(); i++) {
		if ('0' <= a[i] && a[i] <= '9') {
			anum += a[i] - '0';
		}
		if ('0' <= b[i] && b[i] <= '9') {
			bnum += b[i] - '0';
		}
	}
	if (anum != bnum) return anum < bnum;
	return a < b;

}

int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	int n;
	string s;
	vector<string> v;
	cin >> n;
	for (int i = 0; i < n ; i++) {
		cin >> s;
		v.push_back(s);
	}
	sort(v.begin(), v.end(), cmp);
	for (string i : v) cout << i << "\n";
}