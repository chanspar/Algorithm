#include <bits/stdc++.h>
using namespace std;


int n;
int a[1000004], ret[1000004];
stack<int> st;
int main() {
	cin >> n;
	memset(ret, -1, sizeof(ret));
	for (int i=0; i <n; i++) {
		cin >> a[i];
		while (st.size() && a[st.top()] < a[i]) {
			ret[st.top()] = a[i];
			st.pop();
		}
		st.push(i);
		
	}

	for (int i = 0; i < n; i++) {
		cout << ret[i] << " ";
	}




}