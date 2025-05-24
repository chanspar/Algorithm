while True:
	line = input()
	if line == '.': break
	stack = []
	for s in line:
		if s == '(' or s == '[':
			stack.append(s)
		elif s == ')':
			if stack and stack[-1] == '(':
				stack.pop()
			else:
				stack.append(s)
		elif s == ']':
			if stack and stack[-1] == '[':
				stack.pop()
			else:
				stack.append(s)
	if not stack:
		print('yes')
	else:
		print('no')