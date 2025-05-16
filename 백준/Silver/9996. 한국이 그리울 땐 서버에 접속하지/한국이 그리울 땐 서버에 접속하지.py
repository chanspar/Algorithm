n = int(input())

pattern = input()
idx = pattern.index('*')
# for c in range(len(pattern)):
# 	if pattern[c] == '*':
# 		idx = c
# 		break

head = pattern[0:idx]
tail = pattern[idx + 1:]

# print(head)
# print(tail)

for i in range(n):
	s = input()
	if len(s) < len(head) + len(tail):
		print('NE')
	# s_head = s[0:idx]
	# s_tail = s[-(len(pattern) - idx - 1):]

	elif s.startswith(head) and s.endswith(tail):
		print('DA')
	else:
		print('NE')

