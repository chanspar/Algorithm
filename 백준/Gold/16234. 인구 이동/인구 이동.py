import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

n,l,r = map(int, input().split())
mp = [list(map(int, input().split())) for _ in range(n)]

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

def dfs(y, x):
    visited[y][x] = 1
    current_total = mp[y][x]
    li.append((y,x))
    
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0 <= ny < n and 0 <= nx < n:
            if l <= abs(mp[y][x] - mp[ny][nx]) <= r:
                if visited[ny][nx] == 0:
                    current_total += dfs(ny, nx)
            
    return current_total        
            
result = 0
while True:
    cnt = 0
    visited = [[0] * n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if visited[i][j] == 0:
                li = []
                total = dfs(i,j)
                cnt += 1
                len_li = len(li)
                for a in li:
                    mp[a[0]][a[1]] = total // len_li
    if cnt == n*n:
        break
    result += 1

print(result)
