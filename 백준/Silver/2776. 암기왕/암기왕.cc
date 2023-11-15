#include <bits/stdc++.h>
using namespace std;

int T, a1, a2, tmp;
int arr1[1000005];

int	check(int tmp, int arr[]){
	int l=0, r=a1 -1, mid;
	while (l <= r){
		mid = (r + l) / 2;
		if (arr[mid] == tmp) return 1;
		else if (arr[mid] > tmp) r = mid - 1;
		else l = mid + 1;
	}
	return 0;
}

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);
	cin >> T;
	while (T--){
		fill(arr1, arr1+1000005, 0);
		cin >> a1;
		for (int i=0; i < a1; i++){
			cin >> arr1[i];
		}
		sort(arr1, arr1 + a1);
		cin >> a2;
		for (int i=0; i < a2; i++){
			cin >> tmp;
			cout << check(tmp, arr1) << "\n";
		}
	}

	return 0;
}