n = int(input())
check = '369'

result = 0
for i in range(1, n+1):
	str_num = str(i)
	for c in check:
		if c in str_num:
			result += str_num.count(c)
print(result)
