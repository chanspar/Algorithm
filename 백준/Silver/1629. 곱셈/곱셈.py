# A * A * A * A * A * A -> A ^ B -> A ^ B/2 * A ^ B/2

a, b, c = map(int, input().split(' '))

def go(n):
	if n == 1:
		return a % c
	
	half = go(n // 2)
	
	if n % 2 == 1:
		return half * half * a % c
	else:
		return half * half % c

print(go(b))