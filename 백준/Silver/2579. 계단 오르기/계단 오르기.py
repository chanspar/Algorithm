import sys

input = sys.stdin.readline

'''
dp[k][1] = max(dp[k-2][1], dp[k-2][2]) + s[k] 
dp[k][2] = dp[k-1][1] + s[k]
'''

n = int(input())
li = []
for _ in range(n):
    li.append(int(input()))

dp = [[0] * 2 for _ in range(n)]

if n == 1:
    print(li[0])
    sys.exit()
elif n == 2:
    print(li[0] + li[1])
    sys.exit()

dp[0][0] = li[0]
dp[1][0] = li[1]
dp[1][1] = li[0] + li[1]

for i in range(2, n):
    dp[i][0] = max(dp[i-2][0], dp[i-2][1]) + li[i]
    dp[i][1] = dp[i-1][0] + li[i]

print(max(dp[n-1][0], dp[n-1][1]))
