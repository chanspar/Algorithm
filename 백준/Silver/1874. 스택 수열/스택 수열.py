import sys
input = sys.stdin.readline

n = int(input())
li = [int(input()) for _ in range(n)]

stack = []
result = []
current = 1  # 스택에 push할 다음 숫자

# li_index = 0 # 이 부분을 삭제하고 li의 pop(0) 대신 일반적인 for loop 사용

for num in li:
    # 현재 스택에 넣어야 할 숫자가 li의 현재 숫자보다 작거나 같으면 계속 push
    while current <= num:
        stack.append(current)
        result.append('+')
        current += 1
    
    # 스택의 맨 위 숫자가 li의 현재 숫자와 같으면 pop
    if stack and stack[-1] == num:
        stack.pop()
        result.append('-')
    else:
        # 스택의 맨 위 숫자가 li의 현재 숫자와 다르면 스택 수열을 만들 수 없음
        print('NO')
        exit()

# 모든 숫자를 처리한 후 스택이 비어있으면 성공
# 이 코드는 위의 로직에서 이미 모든 스택이 비워졌을 때만 성공하기 때문에 이 조건은 불필요.
# if not stack:
#     for op in result:
#         print(op)
# else:
#     print('NO')

# 위의 else에서 이미 프로그램이 종료되므로 아래와 같이 간단하게 출력
for op in result:
    print(op)