import sys

# 재귀 깊이 제한을 풀어주는 것이 좋음 (문제 조건에 따라)
sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline

# 방향 벡터
dy = [-1, 0, 1, 0]
dx = [0, 1, 0, -1]

# 수정된 DFS 함수
def dfs(vy, vx):
    visited[vy][vx] = True
    # 현재 위치를 포함하므로 넓이는 1에서 시작
    area = 1
    
    # 4방향 탐색
    for i in range(4):
        ny = vy + dy[i]
        nx = vx + dx[i]
        
        # 격자 범위 안이고, 방문하지 않았으며, 그림(1)의 일부일 경우
        if 0 <= ny < n and 0 <= nx < m and \
           not visited[ny][nx] and mp[ny][nx] == 1:
            # 재귀적으로 탐색한 넓이를 더해줌
            area += dfs(ny, nx)
            
    return area

# 입력 처리
n, m = map(int, input().split())
mp = [list(map(int, input().split())) for _ in range(n)]
visited = [[False for _ in range(m)] for _ in range(n)]

# 그림의 개수와 최대 넓이
cnt = 0
# 그림이 없을 경우를 대비해 최대 넓이 초기값을 0으로 설정
max_area = 0

# 전체 격자 순회
for i in range(n):
    for j in range(m):
        # 아직 방문하지 않은 그림(1)을 찾으면
        if not visited[i][j] and mp[i][j] == 1:
            # 그림 개수 1 증가
            cnt += 1
            # DFS로 현재 그림의 넓이를 구하고, 최대 넓이 업데이트
            max_area = max(max_area, dfs(i, j))

# 결과 출력
print(cnt)
print(max_area)