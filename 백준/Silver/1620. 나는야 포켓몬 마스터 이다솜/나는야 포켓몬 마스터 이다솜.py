a, b = input().split(' ')
a = int(a)
b = int(b)


mp1 = {}

for i in range(a):
	s = input()
	mp1[s] = i + 1
	mp1[str(i + 1)] = s

for _ in range(b):
	answer = input()
	print(mp1[answer])	