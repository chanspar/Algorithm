t = int(input())

while t > 0:
	n = int(input())
	mp = {}
	for _ in range(n):
		s = input().split(' ')[1]
		if s in mp:
			mp[s] = mp.get(s) + 1
		else:
			mp[s] = 1
	ret = 1
	for v in mp.values():
		ret = ret * (v + 1)
	
	print(ret - 1)
	t -= 1