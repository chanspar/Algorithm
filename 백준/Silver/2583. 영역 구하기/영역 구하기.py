import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

m,n,k = map(int, input().split())
dy=[-1,0,1,0]
dx=[0,1,0,-1]
mp = [[0] * n for _ in range(m)]

def paint(x1,y1,x2,y2):
    for i in range(y1, y2):
        for j in range(x1, x2):
            mp[i][j] = 1

for _ in range(k):
    s_x, s_y, e_x, e_y = map(int, input().split())
    paint(s_x, s_y, e_x, e_y)

def go(y,x):
    visited[y][x] = 1
    area = 1
    
    for i in range(4):
        ny=y+dy[i]
        nx=x+dx[i]
        if 0 <= nx < n and 0 <= ny < m:
            if visited[ny][nx] == 0 and mp[ny][nx] == 0:
                area += go(ny, nx)
    return area

visited = [[0]*n for _ in range(m)]
result = []
cnt = 0
for i in range(m):
    for j in range(n):
        if visited[i][j] == 0 and mp[i][j] == 0:
            cnt += 1
            result.append(go(i,j))

result.sort()
print(cnt)
print(*result)
