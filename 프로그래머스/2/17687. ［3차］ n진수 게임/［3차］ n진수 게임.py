arr1 = ['A', 'B', 'C', 'D', 'E', 'F']

def n_base(n, num):
    result = ""
    if num == 0:
        return '0'
    
    while num != 0:
        c = num % n
        if 10 <= c < 16:
            i = c % 10
            c = arr1[i]
        else:
            c = str(c)            
        result = c + result
        num //= n
    return result
    
def solution(n, t, m, p):
    answer = ''
    
    # print(n_base(2, 0))
    idx = 0
    need_len = t * m
    full_answer = ""
    while len(full_answer) < need_len:
        full_answer += n_base(n, idx)
        idx += 1
    
    for i in range(p-1, len(full_answer), m):
        # print(i, end = ' ')
        # print(full_answer[i])
        answer = answer + full_answer[i]
        if len(answer) == t:
            break
    # print(full_answer)
    return answer