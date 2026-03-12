import sys
from itertools import combinations

input = sys.stdin.readline

n = int(input())

a,b,c,d = map(int, input().split())

arr = [list(map(int, input().split())) for _ in range(n)]

li = [i for i in range(n)]

result = -1
results = []

for i in range(1, n + 1):
    for comb in combinations(li, i):
        p,f,s,v,cost=0,0,0,0,0
        for j in comb:
            p += arr[j][0]
            f += arr[j][1]
            s += arr[j][2]
            v += arr[j][3]
            cost += arr[j][4]
        if p >= a and f >= b and s >= c and v >= d:
            cur_indices = [k + 1 for k in comb]

            if result == -1 or cost < result:
                result = cost
                results = cur_indices
            elif cost == result:
                if cur_indices < results:
                    results = cur_indices

if result == -1:
    print(-1)
else:
    print(result)
    print(*results)
