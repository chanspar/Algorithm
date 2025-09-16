def solution(n): # n 가로길이 (1 <= n <= 60,000)
    # 메모이제이션 배열 
    dp = [0] * 60002
    
    # 초기값 
    dp[1] = 1 # 세로 타일 한개
    dp[2] = 2 # (dp[1] + 세로) (가로 + 가로)
    # dp[3] = 3 # 세로 + dp[2],  가로가로 + dp[1]
    # dp[4]: 세로 + dp[3],  가로가로 + dp[2] 
    # dp[5]: 세로 + dp[4], 가로가로 + dp[3] 
    # 점화식 도출: dp[n] = dp[n-1] + dp[n-2]
    
    for i in range(3, n + 1):
        dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007 
    
    '''
    배열x version
    if n == 1:
        return 1
    if n == 2:
        return 2

    a, b = 1, 2  # dp[1], dp[2]
    for _ in range(3, n + 1):
        a, b = b, (a + b) % 1000000007 
    return b
    '''
        
    return dp[n] 

