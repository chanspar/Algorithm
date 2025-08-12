import sys
input = sys.stdin.readline

n = input()
li = [int(i) for i in input().split()]
li.sort()

start = 0
end = len(li) - 1

x = int(input())
result = 0
while start < end:
	if li[start] + li[end] == x:
		result += 1
		end -= 1
	elif li[start] + li[end] < x:
		start += 1
	else:
		end -= 1

print(result)
