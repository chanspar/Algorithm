import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())
mp = [list(map(int, input().split())) for _ in range(n)]
INF = float("inf")

# dp[(현재위치, 방문한도시들의 튜플)]
memo = {}

def tsp(here, visited):
    if len(visited) == n:
        return mp[here][0] if mp[here][0] != 0 else INF
    
    state = (here, visited)
    if state in memo:
        return memo[state]
    
    ret = INF
    for i in range(n):
        if i not in visited and mp[here][i] != 0:
            next_visited = tuple(sorted(visited + (i,)))
            res = tsp(i, next_visited) + mp[here][i]
            ret = min(ret, res)
    memo[state] = ret
    return ret

print(tsp(0, (0,)))
