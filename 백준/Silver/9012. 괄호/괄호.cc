#include <bits/stdc++.h>
using namespace std;

int main() {
	int t; 
	string s;
	cin >> t;

	while (t--) {
		stack<char> st;
		int flag = 0;
		cin >> s;

		for (auto c : s) {
			if (st.empty()) {
				if (c == ')') {
					flag = 1;
					break;
				}
				st.push(c);
			} 
			else {
				if (st.top() != c) {
					st.pop();
				} else {
					st.push(c);
				}
			}
		}
		
		if (flag == 1) cout << "NO\n";
		else if (st.size() != 0) cout << "NO\n";
		else cout << "YES\n";
	}
}