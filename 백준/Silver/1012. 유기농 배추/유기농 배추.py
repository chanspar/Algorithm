import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline


dy = [1, 0, -1, 0]
dx = [0, 1, 0, -1]

t = int(input())

def go(y, x):
    visited[y][x] = 1

    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if ny < 0 or nx < 0 or ny >= n or nx >= m: continue
        if visited[ny][nx] == 0 and arr[ny][nx] == 1:
            go(ny,nx)



while t > 0:
    # initial setting
    m, n, k = map(int, input().split(' '))
    arr = [[0 for _ in range(m)] for _ in range(n)] 
    visited = [[0 for _ in range(m)] for _ in range(n)] 
    for i in range(k):
        a, b = map(int, input().split(' '))
        arr[b][a] = 1
    ret = 0

    # dfs let's go
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 1 and visited[i][j] == 0:
                go(i,j)
                ret += 1
    print(ret)
    t -= 1

