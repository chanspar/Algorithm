import sys
input = sys.stdin.readline

tmp = list(map(int, input().split()))
n = tmp[0]
li = []
for i in range(1, len(tmp)):
	li.append(tmp[i])

while len(li) != n:
	tmp = list(map(int, input().split()))
	for i in range(0, len(tmp)):
		li.append(tmp[i])

rev_li = []
for i in li:
	rev_str = int(''.join(reversed(str(i))))
	rev_li.append(rev_str)

rev_li.sort()
for i in rev_li:
	print(i)
