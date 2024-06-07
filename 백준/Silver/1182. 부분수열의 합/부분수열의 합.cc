#include <bits/stdc++.h>
using namespace std;

int n, s, ret = 0;
int arr[25];
vector<int> v;

void go(int size, int k) {
	if (v.size() == size) {
		int sum = accumulate(v.begin(), v.end(), 0);
		if (sum == s) ret++;
		return;
	}
	for (int i = k; i < n; i++) {
		v.push_back(arr[i]);
		go(size, i + 1);
		v.pop_back();
	}

}

int main() {
	cin >> n >> s;
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	for (int i = 1; i <= n; i++) {
		go(i, 0);
	}
	cout << ret << "\n";

}