from collections import deque

n,m = map(int, input().split())
li = [int(i) for i in input().split()]
dq = deque([i for i in range(1, n + 1)])

result = 0
while li:
	mv = 0
	while li[0] != dq[0]:
		dq.rotate(1)
		mv += 1
	
	mn = min(mv, len(dq) - mv)
	result += mn
	if li[0] == dq[0]:
		li.pop(0)
		dq.popleft()
	
print(result)

		

