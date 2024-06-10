#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;
int arr[100004];
int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	int mx = 0;
	cin >> n;
	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	sort(arr, arr+n);
	for (int i = 0; i < n; i++) {
		mx = max(mx, arr[i] * (n - i));
	}
	cout << mx << "\n";
}