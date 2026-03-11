import sys
from collections import deque

input = sys.stdin.readline

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]
n,m = map(int, input().split())
mp = [list(map(int, input().rstrip())) for _ in range(n)]
visited = [[0 for _ in range(m)] for _ in range(n)]

q = deque()
q.append((0, 0))
visited[0][0] = 1

while q:
    x,y = q.popleft()
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
    
        if not (0 <= nx < m and 0 <= ny < n):
            continue
        if mp[ny][nx] == 0:
            continue
        if visited[ny][nx] != 0:
            continue
        visited[ny][nx] = visited[y][x] + 1
        q.append((nx, ny))

print(visited[n-1][m-1])
