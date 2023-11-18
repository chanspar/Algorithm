#include <bits/stdc++.h>
using namespace std;

int t,sharp=1;
int a[50][50];

int main(){
	cin >> t;
	while (t--){
		int n;
		int cx, cy;

		fill(&a[0][0], &a[49][50], 0);

		cin >> n;
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				scanf("%1d", &a[i][j]);
			}
		}
		cx = n / 2;
		cy = n / 2;


		int sum =0;
		
		for (int y=0; y <= cy; y++){
			for (int x=cx; x <= cx + y ; x++){
				sum += a[y][x];
				if (y != cy)
					sum += a[n - y -1][x];
			}
			for (int x=cx - 1; x >= cx - y; x--){
				sum += a[y][x];
				if (y != cy)
					sum += a[n - y -1][x];
			}
		}
		

		cout << "#" << sharp << " " << sum << "\n";

		sharp++;
	}
	return 0;
}