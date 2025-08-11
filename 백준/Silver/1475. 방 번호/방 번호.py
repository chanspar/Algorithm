n = input()

arr = [0] * 10
for i in n:
	if i == '9':
		arr[6] += 1
	else:
		arr[int(i)] += 1

arr[6] = int(arr[6] / 2 + 0.5)


print(max(arr))