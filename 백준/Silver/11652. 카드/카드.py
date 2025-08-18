import sys
input = sys.stdin.readline

n = int(input())

li = [input().rstrip() for _ in range(n)]

d = dict()

for i in li:
	d[i] = d.get(i, 0) + 1

result = sorted(d, key=lambda x: (-int(d[x]), int(x)))
print(result[0])
