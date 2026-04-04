import sys

input = sys.stdin.readline
k,n = map(int, input().split())
arr = [int(input()) for _ in range(k)]

def chk_cnt(l):
    res = 0
    for i in arr:
        res += i // l
    return res >= n

start = 1
end = 2**31 - 1

while start < end:
    mid = (start + end + 1) // 2
    
    if chk_cnt(mid):
        start = mid
    else:
        end = mid - 1

print(start)
        