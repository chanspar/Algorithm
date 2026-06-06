from collections import Counter

def solution(s):
    answer = []
    s_process = s[2:-2].replace(',', ' ').replace('{', '').replace('}', '').split()
    d = dict(Counter(s_process))
    d = sorted(d.items(), key=lambda x: -x[1])
    # print(d)
    for k, v in d:
        answer.append(int(k))
    
    return answer