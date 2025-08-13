import sys
input = sys.stdin.readline

n = int(input())

li = []
for _ in range(n):
    a = int(input())
    li.append(a)

res = []
result = []
for i in range(1, n + 1):
    res.append(i)
    result.append('+')
    if li[0] == i:
        result.append('-')
        li.pop(0)
        res.pop()
        while res and li and li[0] == res[-1]:
            result.append('-')
            li.pop(0)
            res.pop()

if res:
    print('NO')
else:
    for i in result:
        print(i)