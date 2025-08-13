import sys
input = sys.stdin.readline

# 왼쪽 스택에는 커서의 왼쪽 문자열을, 오른쪽 스택에는 오른쪽 문자열을 거꾸로 저장합니다.
left = list(input().rstrip())
right = []

for _ in range(int(input())):
    cmd = input().split()
    op = cmd[0]

    if op == 'L':
        if left:
            right.append(left.pop())
    elif op == 'D':
        if right:
            left.append(right.pop())
    elif op == 'B':
        if left:
            left.pop()
    elif op == 'P':
        left.append(cmd[1])
print(''.join(left + right[::-1]))
