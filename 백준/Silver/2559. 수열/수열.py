import sys

input = sys.stdin.readline

n, k = map(int, input().split())

arr = list(map(int, input().split()))
cumsum = []
tmp = 0
for i in arr:
    tmp += i
    cumsum.append(tmp)

result = cumsum[k - 1]
for i in range(k, len(cumsum)):
    result = max(result, cumsum[i] - cumsum[i - k])

print(result)
