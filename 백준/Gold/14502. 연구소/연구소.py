import sys
sys.setrecursionlimit(10000)

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

max_area = 0

def check_area(visited):
    area = 0
    for i in range(n):
        for j in range(m):
            if visited[i][j] == 0 and arr[i][j] == 0:
                area += 1
    return area

def dfs(y, x, visited):
    visited[y][x] = 1
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if ny < 0 or nx < 0 or ny >= n or nx >= m:
            continue
        if visited[ny][nx]:
            continue
        if arr[ny][nx] == 0 or arr[ny][nx] == 2:
            dfs(ny, nx, visited)

def simulate():
    visited = [[0]*m for _ in range(n)]
    for i in range(n):
        for j in range(m):
            if visited[i][j] == 0 and arr[i][j] == 2:
                dfs(i, j, visited)
    return check_area(visited)

def install_wall(cnt=0, start=0):
    global max_area
    if cnt == 3:
        max_area = max(max_area, simulate())
        return
    for idx in range(start, n*m):
        i = idx // m
        j = idx % m
        if arr[i][j] == 0:
            arr[i][j] = 1
            install_wall(cnt+1, idx+1)
            arr[i][j] = 0

install_wall()
print(max_area)
