import sys

input = sys.stdin.readline

t = int(input())

for _ in range(t):
    n = int(input())
    cnt2 = 0
    cnt5 = 0
    i = 2
    while i <= n:
        cnt2 += n // i
        i *= 2
    i = 5
    while i <= n:
        cnt5 += n // i
        i *= 5
    print(min(cnt2, cnt5))
