from itertools import permutations

n,m = map(int, input().split())
li = [i for i in range(1, n+1)]
result = list(permutations(li, m))

for i in range(len(result)):
	print(*result[i])
