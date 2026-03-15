import sys

input = sys.stdin.readline

raw = input().rstrip()
bomb = input().rstrip()
stack = []

for c in raw:
    stack.append(c)
    
    if len(stack) >= len(bomb):
        if ''.join(stack[len(stack) - len(bomb):]) == bomb:
            for _ in range(len(bomb)):
                stack.pop()

if stack:
    print(''.join(stack))
else:
    print('FRULA')
    