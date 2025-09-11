from collections import deque

dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]
def solution(maps):
    row = len(maps)
    col = len(maps[0])
    
    start = (0, 0)
    fin = (row - 1, col - 1)
    visited = [[0 for _ in range(col)] for _ in range(row)]
    
    visited[0][0] = 1
    dq = deque([start])
    
    while dq:
        s_y, s_x = dq.popleft()
        # print(s_x, s_y)
        for i in range(4):
            ny = dy[i] + s_y
            nx = dx[i] + s_x
            if ny < 0 or nx < 0 or nx >= col or ny >= row:
                continue
            if maps[ny][nx] != 1 or visited[ny][nx] != 0:
                continue
            dq.append((ny, nx))
            visited[ny][nx] = visited[s_y][s_x] + 1
    
    result = visited[row - 1][col - 1]
    if result == 0:
        return -1
    return result