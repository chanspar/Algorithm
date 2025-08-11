n, x = map(int, input().split())

li = [int(i) for i in input().split() if int(i) < x ]

print(*li)
