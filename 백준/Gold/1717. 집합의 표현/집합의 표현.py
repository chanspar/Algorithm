import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

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

n,m = map(int, input().split())
p = [-1] * (n + 1)

for _ in range(m):
	q, a, b = map(int, input().split())
	if q == 0:
		uni(a, b)
	else:
		if find(a) == find(b):
			print("YES")
		else:
			print("NO")
