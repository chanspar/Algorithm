from collections import Counter

def solution(topping):
    answer = 0
    human1 = Counter(topping)
    human2 = set()
    
    for tp in topping:
        human1[tp] -= 1
        human2.add(tp)
        if human1[tp] == 0:
            del human1[tp]
        
        if len(human1) == len(human2):
            answer += 1    
    
    return answer