import sys
from itertools import combinations

def chicken_distance(r1, c1, r2, c2):
    return abs(r1-r2) + abs(c1-c2)

input = sys.stdin.readline
n,m = map(int, input().split())
mp = [list(map(int, input().split())) for _ in range(n)]

arr = []
houses = []
for i in range(n):
    for j in range(n):
        if mp[i][j] == 2:
            arr.append((i,j))
        if mp[i][j] == 1:
            houses.append((i,j))

result = float("inf")
for pair in combinations(arr, m):
    distance = 0
    for a, b in houses:
        tmp = float("inf")
        for y, x in pair:
            dis = chicken_distance(y,x,a,b)
            tmp = min(tmp, dis)
        distance += tmp
    result = min(result, distance)
    

print(result)
