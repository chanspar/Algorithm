from itertools import combinations

n,s = map(int, input().split())

li = list(map(int, input().split()))
# print(li)


result = 0
for i in range(1, n + 1):
	a = list(combinations(li, i))
	for j in range(len(a)):
		if sum(a[j]) == s:
			result += 1

print(result)
