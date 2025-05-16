n = int(input())

ret = 0
for _ in range(n):
	s = input()
	stack = []

	for c in s:
		if c not in stack:
			stack.append(c)
		elif stack[-1] == c:
			stack.pop()
		else:
			stack.append(c)
	# print(stack)
	if not stack:
		ret += 1
print(ret)



# from collections import deque
# dq = deque()
# dq.append(1)
# dq.appendleft(2)
# dq.pop()
# dq.popleft()
