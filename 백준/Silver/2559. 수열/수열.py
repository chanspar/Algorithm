a, b = input().split(' ')
a = int(a)
b = int(b)

num = input().split(' ')
li = []
for i in range(len(num)):
	if i == 0:
		li.append(int(num[i]))
	else:
		li.append(int(num[i]) + int(li[i - 1]))

mx = li[b - 1]
for i in range(b, a):
	mx = max(mx, li[i] - li[i - b])
print(mx)