#include <bits/stdc++.h>
using namespace std;

int main() {
	int num = 666;
	int n, idx = 0;

	cin >> n;

	while (1) {

		if (to_string(num).find("666") != string::npos) {
			idx++;
		} 
		if (idx == n) break;
		num++;
	}
	cout << num << "\n";
}