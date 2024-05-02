#include <iostream>
#include <algorithm>
#include <vector>
#include <numeric>
#include <cstring>
#include <map>
#include <string>
#include <stack>
#include <queue>
using namespace std;


int n;
int arr[65][65], visited[65][65];


bool dfs(int x1, int y1, int x2, int y2) {
	int num = arr[y1][x1];
	for (int i = y1; i < y2; i++) {
		for (int j = x1; j < x2; j++) {
			if (num != arr[i][j])
				return false;
		}
	}
	cout << num;
	return true;
}

void go(int x1, int y1, int x2, int y2) {
	if (dfs(x1, y1, x2, y2)) {
		return ;
	}
	cout << "(";
	go(x1, y1, x1 + (x2 - x1) / 2, y1 + (y2 - y1) / 2);
	go(x1 + (x2 - x1) / 2, y1, x2, y1 + (y2 - y1) / 2);
	go(x1, y1+ (y2 - y1) / 2, x1 + (x2 - x1) / 2, y2);
	go(x1 + (x2 - x1) / 2, y1+ (y2 - y1) / 2, x2, y2);
	cout << ")";
}

int main()
{
	cin >> n;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			scanf("%1d", &arr[i][j]);
		}
	}

	go(0, 0, n, n);

	return 0;
}
