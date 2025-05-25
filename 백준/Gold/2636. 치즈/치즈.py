import sys
from collections import deque
input = sys.stdin.readline

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

n, m = map(int, input().split())
mp = [list(map(int, input().split())) for _ in range(n)]

time = 0
last_cheese = 0

while True:
    visited = [[0]*m for _ in range(n)]
    q = deque()
    q.append((0, 0))
    visited[0][0] = 1
    outer_cheese = []

    # BFS로 외부공기 탐색
    while q:
        y, x = q.popleft()
        for d in range(4):
            ny = y + dy[d]
            nx = x + dx[d]
            if 0 <= ny < n and 0 <= nx < m and not visited[ny][nx]:
                if mp[ny][nx] == 0:
                    visited[ny][nx] = 1
                    q.append((ny, nx))
                elif mp[ny][nx] == 1:
                    # 외부공기에서 만나는 치즈: 겉 테두리
                    visited[ny][nx] = 1
                    outer_cheese.append((ny, nx))

    if not outer_cheese:
        break

    last_cheese = len(outer_cheese)
    # 겉 테두리 치즈 녹이기
    for y, x in outer_cheese:
        mp[y][x] = 0

    time += 1

print(time)
print(last_cheese)
