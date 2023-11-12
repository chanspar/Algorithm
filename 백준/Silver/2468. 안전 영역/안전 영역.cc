#include <bits/stdc++.h>
using namespace std;

const int dx[] = {0, 1, 0, -1};
const int dy[] = {-1, 0 , 1, 0};
int n;
int a[102][102], visited[102][102];

void dfs(int y, int x, int z){
	visited[y][x] = 1;
	for (int i=0; i < 4; i++){
		int nx = x + dx[i];
		int ny = y + dy[i];
		if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
		if (visited[ny][nx] == 1) continue;
		if (a[ny][nx] < z) continue;
		dfs(ny, nx, z);
	}
}

int main(){
	int max_area = -1;
	cin >> n;
	
	for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
			cin >> a[i][j];
		}
	}

	for (int i = 1; i <= 100; i++){
		int cnt = 0;
		fill(&visited[0][0], &visited[101][102], 0);
		for (int y = 0; y < n; y++){
			for (int x =0; x < n; x++){
				if (a[y][x] >= i && !visited[y][x]){
					cnt++;
					dfs(y, x, i);
				}
			}
		}
		max_area = max(max_area, cnt);
	}

	cout << max_area << "\n";
	return 0;
}