import sys
from collections import deque

'''
1 -> 3
2 -> 3
위상정렬
'''

input = sys.stdin.readline
n,m= map(int, input().split())

adj = [[] for _ in range(n + 1)]
deg = [0] * (n + 1)

for _ in range(m):
	a, b = map(int, input().split())
	adj[a].append(b)
	deg[b] += 1

q = deque()
result = []

for i in range(1, n+1):
	if deg[i] == 0:
		q.append(i)

while q:
	cur = q.popleft()
	result.append(cur)

	for nxt in adj[cur]:
		deg[nxt] -= 1
		if deg[nxt] == 0:
			q.append(nxt)

if len(result) != n:
	print('no')

print(*result)
