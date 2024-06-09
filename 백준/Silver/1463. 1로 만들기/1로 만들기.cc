#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
	cin.tie(0); ios_base::sync_with_stdio(false);
	int num, visited[1000004], ret = 0;
	
	memset(visited, 0, sizeof(visited));
	cin >> num;
	queue<int> q;
	q.push(num);
	visited[num] = 1;
	while (q.size()) {
		int a = q.front(); q.pop();
		if (a == 1) {
			ret = visited[a];
			break;
		}
		if (a % 3 == 0) {
			if (!visited[a / 3])
			{	
				q.push(a / 3);
				visited[a/3] = visited[a] + 1;
			}
		}
		if (a % 2 == 0) {
			if (!visited[a / 2])
			{	
				q.push(a / 2);
				visited[a/2] = visited[a] + 1;
			}
		}
		if (!visited[a - 1]) {
			q.push(a - 1);
			visited[a - 1] = visited[a] + 1;
		}
		
	}
	cout << ret - 1 << "\n";
}