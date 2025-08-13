import sys
input = sys.stdin.readline

k = int(input())
res = []
for _ in range(k):
    a = int(input())
    if a == 0:
        res.pop()
    else:
        res.append(a)

print(sum(res))
