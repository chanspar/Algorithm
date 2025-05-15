import itertools

li = []

for i in range(9):
	li.append(int(input()))
# array = [int(input()) for _ in range(9)]

# nPr = itertools.permutations(li, 3)
# print(list(nPr))
nCr = itertools.combinations(li, 7)


for i in nCr:
	if sum(i) == 100:
		for j in sorted(i):
			print(j)
		break