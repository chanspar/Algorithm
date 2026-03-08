s = input()
ret = [0 for i in range(26)]

for i in s:
	ret[ord(i) - ord('a')] += 1

for i in range(26):
	print(ret[i], end=' ')