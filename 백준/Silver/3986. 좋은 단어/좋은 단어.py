n = int(input())

result = 0
for _ in range(n):
    stack = []
    s = input()
    for c in s:
        if not stack:
            stack.append(c)
        else:
            if stack[-1] == c:
                stack.pop()
            else:
                stack.append(c)
    
    if not stack:
        result += 1
    
print(result)
