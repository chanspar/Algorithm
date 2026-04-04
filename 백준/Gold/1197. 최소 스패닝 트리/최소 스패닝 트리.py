import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline
v,e = map(int, input().split())

p = [-1] * (v + 1)

def find(x):
    if p[x] < 0:
        return x
    p[x] = find(p[x])
    return p[x]

def uni(u, v):
    u = find(u)
    v = find(v)
    
    if u == v:
        return False
    
    p[v] = u
    return True

edges = []
for _ in range(e):
    a,b,cost = map(int, input().split())
    edges.append((cost,a,b))

srt_edges = sorted(edges)

cnt = 0
result = 0

for i in range(e):
    cost, a, b = srt_edges[i]
    if uni(a,b) == False:
        continue
    result += cost
    cnt += 1
    if cnt == v-1:
        break

print(result)
        