a,b,c = input().split()
a = int(a)
b = int(b)
c = int(c)

park = [0] * 102
ret = 0

for i in range(3):
	s, e = input().split()
	s = int(s)
	e = int(e)
	for j in range(s, e):
		park[j] += 1

for i in range(1, 101):
	if park[i] == 1:
		ret += a
	elif park[i] == 2:
		ret += b * 2
	elif park[i] == 3:
		ret += c * 3

print(ret)