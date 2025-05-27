import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
stack = []
ret = [-1 for _ in range(n)]

for i in range(n):
    # 스택이 비어있지 않고, 현재 값이 스택 top의 값보다 클 때
    while stack and arr[stack[-1]] < arr[i]:
        idx = stack.pop()
        ret[idx] = arr[i]
    
    # 현재 인덱스를 스택에 추가
    stack.append(i)

print(*ret)
