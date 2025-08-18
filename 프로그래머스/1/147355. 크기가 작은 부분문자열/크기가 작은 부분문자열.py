def solution(t, p):
    answer = 0
    p_len = len(p)
    num_p = int(p)
    
    for i in range(0, len(t) - p_len + 1):
        a = int(t[i:i+p_len])
        if a <= num_p:
            answer += 1
    
    return answer