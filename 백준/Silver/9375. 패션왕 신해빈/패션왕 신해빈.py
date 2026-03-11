import sys
from collections import defaultdict

input = sys.stdin.readline

T = int(input())

while T > 0:
    n = int(input())
    d = defaultdict(int)
    for _ in range(n):
        s = input().rstrip().split()[1]
        d[s] += 1
    
    result = 1
    for k, v in d.items():
        result = result * (v + 1)
    
    print(result - 1)
    T -= 1
