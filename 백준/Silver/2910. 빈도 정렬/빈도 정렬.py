import sys
from collections import OrderedDict

input = sys.stdin.readline
n,c = map(int, input().split())
li = list(input().split())

d = OrderedDict()
for a in li:
    d[a] = d.get(a, 0) + 1

# print(d)

result = ''
for k, v in sorted(d.items(), key=lambda x: -x[1]):
    for _ in range(v):
        result += k + ' '

print(result)
