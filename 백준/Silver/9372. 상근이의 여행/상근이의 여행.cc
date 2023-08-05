#include <bits/stdc++.h>
using namespace std;
int cnt = 0;
void dfs(int node, vector<vector<int>>& graph, vector<bool>& visited) {
    visited[node] = true;
    for (int neighbor : graph[node]) {
        if (!visited[neighbor]) {
			cnt++;
            dfs(neighbor, graph, visited);
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int t, country, airplane;
    int a, b;
    cin >> t;

    while (t--) {
        cin >> country >> airplane;
        vector<vector<int>> graph(country + 1);
        vector<bool> visited(country + 1, false);

        for (int i = 1; i <= airplane; i++) {
            cin >> a >> b;
            graph[a].push_back(b);
            graph[b].push_back(a);
        }

        cnt = 0;
        for (int i = 1; i <= country; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited);
            }
        }

        cout << cnt << '\n';
    }

    return 0;
}
