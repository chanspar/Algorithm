s=input()

for i in s:
	if i.islower():
		print(chr(ord('a') + (ord(i) + 13 - ord('a')) % 26), end='')
	elif i.isupper():
		print(chr(ord('A') + (ord(i) + 13 - ord('A')) % 26), end='')
	else:
		print(i,end='')