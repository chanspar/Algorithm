import sys
from collections import deque

input = sys.stdin.readline

n,m = map(int, input().split())
mp = [list(input().rstrip()) for _ in range(n)]

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def bfs(si, sj):
    visited = [[-1] * m for _ in range(n)]
    dq = deque([(si, sj)])
    visited[si][sj] = 0
    max_dist = 0
    
    while dq:
        y, x = dq.popleft()
        
        for k in range(4):
            ny, nx = y + dy[k], x + dx[k]
            
            if 0 <= ny < n and 0 <= nx < m:
                if mp[ny][nx] == 'L' and visited[ny][nx] == -1:
                    visited[ny][nx] = visited[y][x] + 1
                    max_dist = max(max_dist, visited[ny][nx])
                    dq.append((ny, nx))
    return max_dist

result = 0
for i in range(n):
    for j in range(m):
        if mp[i][j] == 'L':
            if 0 < i < n-1 and 0 < j < m-1:
                if mp[i-1][j] == 'L' and mp[i+1][j] == 'L' and \
                    mp[i][j-1] == 'L' and mp[i][j+1] == 'L':
                    continue
            
            result = max(result, bfs(i, j))

print(result)
