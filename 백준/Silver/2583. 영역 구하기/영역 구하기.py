import sys
input = sys.stdin.readline
sys.setrecursionlimit(10 ** 6)


m, n, k = map(int, input().split(' '))

mp = [[0 for _ in range(n)] for _ in range(m)]
visited = [[0 for _ in range(n)] for _ in range(m)]
dy = [1, 0 , -1, 0]
dx = [0, 1, 0, -1]

def go(y, x):
    visited[y][x] = 1
    global extend 
    extend += 1

    for i in range(4):
        ny = dy[i] + y
        nx = dx[i] + x
        if ny < 0 or nx < 0 or ny >= m or nx >= n or visited[ny][nx] == 1: 
            continue
        if mp[ny][nx] == 0:
            go(ny, nx)


for _ in range(k):
    sx, sy, ex, ey = map(int, input().split(' '))
    for i in range(sy, ey):
        for j in range(sx, ex):
            mp[i][j] = 1
    

ret = 0
result = []
for y in range(m):
    for x in range(n):
        if mp[y][x] == 0 and visited[y][x] == 0:
            extend = 0
            go(y, x)
            ret += 1
            result.append(extend)

print(ret)
for i in sorted(result):
    print(i, end = ' ')