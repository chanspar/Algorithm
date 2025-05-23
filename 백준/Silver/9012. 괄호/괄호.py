
t = int(input())

for _ in range(t):
    stack = []
    ps = list(input())

    for c in ps:
        if not stack:
            stack.append(c)
        elif stack[-1] == '(' and c == ')':
            stack.pop()
        else:
            stack.append(c)
    if not stack: print('YES')
    else: print('NO')


