def solution(prices):
    answer = [0] * len(prices)
    stk = []
    
    for i, v in enumerate(prices):
        while stk and stk[-1][1] > v:
            a, b = stk.pop()
            answer[a] = i - a
        stk.append((i,v))
    last_idx = len(prices) - 1
    while stk:
        a, b = stk.pop()
        answer[a] = last_idx - a
    
    return answer