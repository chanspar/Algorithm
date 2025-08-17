import sys
input = sys.stdin.readline

n = int(input())

li = [ input().split() for _ in range(n)]

li.sort(key=lambda x: (int(x[1]), int(x[0])))

for i in li:
    print(*i)