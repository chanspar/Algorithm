#include <bits/stdc++.h>
using namespace std;


int t=10,sharp =1;
int a[101][101];
int main(){

	while (t--){
		int n, cnt = 0;

		fill(&a[0][0], &a[100][101], 0);
		cin >> n;
		for (int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				cin >> a[i][j];
			}
		}

		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if (a[j][i] == 1){
					for (int k=j+1; k<n; k++){
						if (a[k][i] == 2){
							j = k;
							cnt++;
							break;
						}
					}
				}
			}
		}









		cout << "#" << sharp << " " << cnt << "\n";
		sharp++; 
	}

	return 0;
}

/*
7
1 0 2 0 1 0 1
0 2 0 0 0 0 0
0 0 1 0 0 1 0
0 0 0 0 1 2 2
0 0 0 0 0 1 0
0 0 2 1 0 2 1
0 0 1 2 2 0 2

*/