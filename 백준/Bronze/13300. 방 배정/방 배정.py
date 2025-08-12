import math

n, k = map(int, input().split())

st = [[0] * 2  for _ in range(6)]

for i in range(n):
	a,b = map(int, input().split())
	st[b-1][a] += 1

res=0
for i in range(6):
	for j in range(2):
		res = res + math.ceil(st[i][j] / k)

print(res)