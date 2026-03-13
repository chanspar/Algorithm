import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())
mp = [list(map(int, input().split())) for _ in range(n)]
dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def dfs(y, x, height):
    visited[y][x] = 1
    
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        
        if 0 <= ny < n and 0 <= nx < n:
            if visited[ny][nx] == 0 and mp[ny][nx] > height:
                dfs(ny, nx, height)
    
mx = -1
for i in range(n):
    for j in range(n):
        mx = max(mx, mp[i][j]) 

result = 1
for i in range(1, mx + 1):
    visited = [[0] * n for _ in range(n)]
    cnt = 0
    for j in range(n):
        for k in range(n):
            if visited[j][k] == 0 and mp[j][k] > i:
                cnt += 1
                dfs(j,k, i)
    result = max(result, cnt)
    
print(result)
