#include <bits/stdc++.h>
using namespace std;
int n, costMin = 100 * 20000;
int ret;
int cost[11][11], visited[11][11];
int dy[] = {-1, 0, 1, 0};
int dx[] = {0, 1, 0, -1};

bool checkVisited(int y, int x) {
	for (int i=0; i<4; i++) {
		int ny = y + dy[i];
		int nx = x + dx[i];
		if (visited[ny][nx] == 1) return false;
	}
	return true;
}

int sumCost(int y, int x) {
	int sum = 0;
	sum += cost[y][x];
	visited[y][x] = 1;
	for (int i=0; i<4; i++) {
		int ny = y + dy[i];
		int nx = x + dx[i];
		visited[ny][nx] = 1;
		sum += cost[ny][nx];
	}
	return sum;
}

void reset(int y, int x) {
	visited[y][x] = 0;
	for (int i=0; i<4; i++) {
		int ny = y + dy[i];
		int nx = x + dx[i];
		visited[ny][nx] = 0;
	}
}

void go(int idx) {
	if (idx == 3) {
		//가격 계산
		costMin = min(ret, costMin);
		return ;
	}
	for (int i = 1; i < n -1; i++) {
		for (int j = 1; j < n -1; j++) {
			if (checkVisited(i, j) == false) continue;
			int sumC = sumCost(i, j);
			ret += sumC;
			go(idx + 1);
			ret -= sumC;
			reset(i, j);
		}
	}

}


int main() {
	cin >> n;
	for (int i=0; i<n; i++) {
		for (int j=0; j<n; j++) {
			cin >> cost[i][j];
		}
	}

	go(0);
	cout << costMin << "\n";
}