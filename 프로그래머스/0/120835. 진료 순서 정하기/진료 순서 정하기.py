def solution(emergency):
    answer = [0] * len(emergency)
    i = 1
    for a,b in sorted(enumerate(emergency), key=lambda x: x[1], reverse=True):
        # print(a,b)
        answer[a] = i
        i += 1
        
    return answer