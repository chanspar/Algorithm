#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

bool cmp(string& a, string &b) {
	size_t a_len=a.length(), b_len=b.length();
	if (a_len != b_len) return a_len < b_len;
	return a < b;
}

map<string, int> mp;
int main() {
	int n;
	cin >> n;
	string s;
	vector<string> v;
	for (int i = 0; i < n; i++) {
		cin >> s;
		if (mp[s]) continue;
		mp[s]++;
		v.push_back(s);
	}
	sort(v.begin(), v.end(), cmp);
	for(auto s : v) cout << s << "\n";
}