'''
목표도달지점 n에 갈 수 있는 경우의 수?
1, 2칸 갈 수 있다.

테이블을 만들어보자
dp[1] = 1

dp[2] = dp[1] + 1 , 2칸 -> 2
dp[3] = dp[1] + 2칸 , dp[2] + 1칸
dp[4] = dp[2] + 2칸, dp[3] + 1칸

dp[1] = 1
dp[2] = 2
dp[n] = dp[n-1] + dp[n-2]..
'''

def solution(n):
    if n == 1:
        return 1
    
    dp = [0] * (n + 1)
    dp[1] = 1
    dp[2] = 2
    
    for i in range(3, n + 1):
        dp[i] = dp[i - 1] + dp[i - 2]
    
    return dp[n] % 1234567