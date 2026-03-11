import sys

input = sys.stdin.readline

n = int(input())
m = int(input())
arr = list(map(int, input().split()))
arr.sort()

left = 0
right = n - 1

result = 0
while left < right:
    tmp = arr[left] + arr[right]
    if tmp > m:
        right -= 1
    elif tmp < m:
        left += 1
    else:
        result += 1
        left += 1

print(result)
