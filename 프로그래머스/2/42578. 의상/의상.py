from collections import defaultdict

def solution(clothes):
    answer = 1
    d = defaultdict(int)
    
    for info in clothes:
        # print(info[-1])
        clo = info[-1]
        d[clo] += 1
            
    for v in d.values():
        answer *= v + 1
    
    answer -= 1
            
    
    return answer