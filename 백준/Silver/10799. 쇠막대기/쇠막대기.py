import sys
input = sys.stdin.readline

s = list(input().rstrip())

stack = []
result = 0
i = 0
while len(s) > i:
	if s[i] == '(' and s[i + 1] == ')':
		result += len(stack)
		i += 1
	elif s[i] == '(':
		stack.append(s[i])
	elif s[i] == ')':
		result += 1
		stack.pop()
	i += 1

print(result)