# 1159
import sys
from collections import defaultdict

input = sys.stdin.readline

n = int(input())

d = defaultdict(int)
for i in range(n):
    str = input().rstrip()
    d[str[0]] += 1

result = ""
for k, v in d.items():
    if v >= 5:
        result += k
if result == "":
    print("PREDAJA")
else:
    print(''.join(sorted(result)))
