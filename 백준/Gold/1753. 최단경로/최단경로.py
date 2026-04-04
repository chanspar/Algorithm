import sys
import heapq

input = sys.stdin.readline
v, e = map(int, input().split())
st = int(input())

INF = float("inf")
d = [INF] * (v + 1)

adj = [[] for _ in range(v + 1)]

for _ in range(e):
    u, v_nxt, w = map(int, input().split())
    adj[u].append((w, v_nxt))

pq = []

d[st] = 0
heapq.heappush(pq, (0, st))

while pq:
    cur_dist, cur_node = heapq.heappop(pq)
    
    if d[cur_node] < cur_dist:
        continue
    
    for nxt_dist, nxt_node in adj[cur_node]:
        cost = cur_dist + nxt_dist
        
        if d[nxt_node] <= cost:
            continue
        
        d[nxt_node] = cost
        heapq.heappush(pq, (cost, nxt_node))

for i in range(1, v + 1):
    if d[i] == INF:
        print("INF")
    else:
        print(d[i])
