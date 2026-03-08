import sys
from itertools import combinations

input = sys.stdin.readline

arr = [int(input()) for _ in range(9)]

for items in combinations(arr, 7):
    if sum(items) == 100:
        for i in sorted(items):
            print(i)
        break
