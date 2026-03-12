import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline
dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

T = int(input())

def dfs(y, x, n, m, mp, visited):
    visited[y][x] = 1
    
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0 <= ny < n and 0 <= nx < m:
            if mp[ny][nx] == 1 and not visited[ny][nx]:
                dfs(ny, nx, n, m, mp, visited)

while T > 0:
    m,n,k = map(int, input().split())
    mp = [[0] * m for _ in range(n)]
    visited = [[0] * m for _ in range(n)]
    
    for i in range(k):
        a,b = map(int, input().split())
        mp[b][a] = 1
    
    count = 0
    for i in range(n):
        for j in range(m):
            if mp[i][j] == 1 and not visited[i][j]:
                dfs(i, j, n, m, mp, visited)
                count += 1
    
    print(count)    
    T -= 1


