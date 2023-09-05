#include <bits/stdc++.h>
using namespace std;

int n, m, x, y;
int a[103][103], visited[103][103];
int dy[4] = {-1, 0, 1, 0};
int dx[4] = {0, 1, 0, -1};

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    scanf("%d %d", &n, &m);
    for(int i=0; i < n; i++)
    {
        for (int j=0; j < m; j++)
        {
            scanf("%1d", &a[i][j]);
        }
    }
    queue<pair<int, int>> q;
    visited[0][0] = 1;
    q.push({0,0});
    while (q.size())
    {
        tie(y,x) = q.front();
        q.pop();
        for (int i = 0; i < 4; i++)
        {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || nx < 0 || ny >= n || nx >= m || a[ny][nx] == 0)
                continue;
            if (visited[ny][nx] == 0)
            {
                visited[ny][nx] = visited[y][x] + 1;
                q.push({ny, nx});
            }
        }
    }
    cout << visited[n - 1][m - 1];
    return 0;
}
