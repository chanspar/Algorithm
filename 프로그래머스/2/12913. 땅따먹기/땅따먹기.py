"""
d[0][i] d[1][i] d[2][i] d[3][i]

i = 0
d[0][0] = 1, d[1][0] = 2, d[2][0] = 3, d[3][0] = 5,

i = 1
d[0][i] = max(d[1][i-1], d[2][i-1], d[3][i-1]) + 자기 점수
10, 11, 12 ,11 이 저장됨

i = 2
d[0][i] = 마찬가지
16 15 13 13
찾았다
"""


def solution(land):
    answer = 0
    dp = [[0] * 4 for _ in range(len(land))]
    dp[0][0] = land[0][0]
    dp[0][1] = land[0][1]
    dp[0][2] = land[0][2]
    dp[0][3] = land[0][3]
    
    for i in range(1, len(land)):
        dp[i][0] = max(dp[i-1][1], dp[i-1][2], dp[i-1][3]) + land[i][0]
        dp[i][1] = max(dp[i-1][0], dp[i-1][2], dp[i-1][3]) + land[i][1]
        dp[i][2] = max(dp[i-1][1], dp[i-1][0], dp[i-1][3]) + land[i][2]
        dp[i][3] = max(dp[i-1][1], dp[i-1][2], dp[i-1][0]) + land[i][3]
    
    fin_idx = len(land) - 1
    answer = max(dp[fin_idx][0], dp[fin_idx][1], dp[fin_idx][2], dp[fin_idx][3])

    return answer