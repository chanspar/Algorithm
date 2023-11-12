#include <bits/stdc++.h>
using namespace std;
const int dx[] = {0, 1, 0, -1};
const int dy[] = {-1, 0 , 1, 0};
int m,n,k,sx,sy,ex,ey;
int a[101][101], visited[101][101];

int dfs(int y, int x){
	visited[y][x] = 1;
	int cnt = 1;
	for (int i=0; i < 4; i++){
		int nx = x + dx[i];
		int ny = y + dy[i];
		if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
		if (visited[ny][nx] == 1) continue;
		if (a[ny][nx]) continue;
		cnt += dfs(ny, nx);
	}
	return cnt;
}

int main(){
	vector<int> v;
	cin >> m >> n >> k;

	for (int i=0; i<k; i++){
		cin >> sx >> sy >> ex >> ey;
		for (int j=sy; j < ey; j++){
			for (int k = sx; k < ex; k++){
				a[j][k] = 1;
			}
		}
	}

	for(int i=0; i<m; i++){
		for (int j=0; j <n; j++){
			if (!visited[i][j] && a[i][j]!=1){
				v.push_back(dfs(i,j));
			}
		}
	}
	cout << v.size() << "\n";
	sort(v.begin(), v.end());
	for (int i : v)
		cout << i << " ";

	return 0;
}