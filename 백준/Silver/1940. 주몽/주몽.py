n = int(input())
m = int(input())
li = list(map(int, input().split()))

li.sort()
left, right = 0, n-1
ret = 0

while left < right:
    s = li[left] + li[right]
    if s == m:
        ret += 1
        left += 1
        right -= 1
    elif s < m:
        left += 1
    else:
        right -= 1

print(ret)
