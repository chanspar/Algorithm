import sys
import bisect

input = sys.stdin.readline
n = int(input())

li = list(map(int, input().split()))
tmp = list(li)
tmp.sort()

uni = []
for i in range(n):
    if i == 0 or tmp[i - 1] != tmp[i]:
        uni.append(tmp[i])

result = []
for i in range(n):
    idx = bisect.bisect_left(uni, li[i])
    result.append(idx)

print(*result)
