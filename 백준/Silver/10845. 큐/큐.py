import sys
input = sys.stdin.readline

n = int(input())

res = []
for _ in range(n):
    cmd = input().split()
    op = cmd[0]

    if op == 'push':
        res.append(cmd[1])
    elif op == 'pop':
        if res:
            print(res.pop(0))
        else:
            print('-1')
    elif op == 'size':
        print(len(res))
    elif op == 'empty':
        if res:
            print('0')
        else:
            print('1')
    elif op == 'front':
        if res:
            print(res[0])
        else:
            print('-1')
    elif op == 'back':
        if res:
            print(res[-1])
        else:
            print('-1')
            