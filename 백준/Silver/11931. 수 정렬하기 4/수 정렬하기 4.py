import sys
input = sys.stdin.readline

n = int(input())

li = [int(input()) for _ in range(n)]

li.sort(reverse=True)

for i in range(n):
    print(li[i])