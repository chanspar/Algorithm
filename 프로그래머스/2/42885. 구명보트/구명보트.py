'''
people: 몸무게 배열
limit: 구명보트 무게 제한 (한번에 2명씩 최대)
80 70 50 50 40 30  
제일 무거운거와 제일 가벼운거가 무게 제한에 맞다면? 보낼까?

'''


def solution(people, limit):
    answer = 0
    
    people_weights = people
    people_weights.sort(reverse=True)
    last_idx = len(people_weights) - 1
    start_idx = 0
    
    
    while True:
        if last_idx < start_idx:
            break
        elif last_idx == start_idx:
            answer += 1
            break
        
        if people_weights[start_idx] + people_weights[last_idx] <= limit:
            answer += 1
            start_idx += 1
            last_idx -= 1
        else:
            answer += 1
            start_idx += 1
    return answer
