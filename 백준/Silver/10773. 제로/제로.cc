#include <bits/stdc++.h>
using namespace std;

stack<int> st;
int main() {
	int k, n, ret = 0;
	cin >> k;
	for (int i = 0; i < k; i++) {
		cin >> n;
		if (n == 0) {
			if (st.size()) {
				st.pop();
			}
		} else {
			st.push(n);
		}
	}
	while (st.size())
	{
		ret += st.top();
		st.pop();
	}
	cout << ret << "\n";
}
