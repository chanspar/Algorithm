import sys
input = sys.stdin.readline

n, k = map(int, input().split())
li = [i for i in range(1, n + 1)]
res = []
idx = 0
while li:
    idx = (idx + k - 1) % len(li)
    res.append(str(li.pop(idx)))

print('<', end='')
print(', '.join(res), end='')
print('>')
