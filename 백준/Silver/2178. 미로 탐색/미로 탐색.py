from collections import deque
a, b = map(int, input().split(' '))
array = [list(map(int, input())) for row in range(a)]
visited = [[0 for col in range(b)] for row in range(a)]
    
# print(array)

dy = [1, 0, -1, 0]
dx = [0, 1, 0, -1]

q = deque()
q.appendleft((0,0))

while q:
    y, x = q.pop()

    for i in range(4):
        ny = dy[i] + y
        nx = dx[i] + x
        if nx < 0 or ny < 0 or ny >= a or nx >= b: continue
        if visited[ny][nx] > 0: continue
        if array[ny][nx] == 1:
            q.appendleft((ny, nx))
            visited[ny][nx] = visited[y][x] + 1

print(visited[a - 1][b - 1] + 1)
