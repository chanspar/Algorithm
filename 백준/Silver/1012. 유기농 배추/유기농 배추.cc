#include <bits/stdc++.h>
using namespace std;

const int dx[] = {0, 1, 0, -1};
const int dy[] = {-1, 0 ,1, 0};
int T, M, N, K, cnt = 0;
int arr[52][52], visited[52][52];

void dfs(int y, int x){
	visited[y][x] = 1;
	for (int i = 0; i < 4; i++){
		int ny = y + dy[i];
		int nx = x + dx[i];
		if (nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
		if (visited[ny][nx]) continue;
		if (arr[ny][nx] == 0) continue;
		dfs(ny, nx);
	}

}

int main()
{
	cin >> T;

	while (T){
		fill(&arr[0][0], &arr[51][52], 0);
		fill(&visited[0][0], &visited[51][52], 0);
		cin >> M >> N >> K;
		cnt = 0;
		while (K){
			int x, y;
			cin >> x >> y;
			arr[y][x] = 1;
			K--;
		}
		for (int i =0; i < N; i++){
			for (int j=0; j < M; j++){
				if (arr[i][j] && visited[i][j] == 0) {
					dfs(i ,j);
					cnt++;
				}
			}
		}
		cout << cnt << "\n";
		T--;
	}
	return 0;
}