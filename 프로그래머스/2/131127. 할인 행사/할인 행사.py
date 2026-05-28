'''
금액 -> 10일 회원

할인 제품은 하루 하나씩 구매 가능

언제 가입해야 원하는 물건을 다 살 수 있을 까?
'''

from copy import deepcopy

def chk_items(dic):
    for k, v in dic.items():
        if v > 0:
            return False
    return True

def solution(want, number, discount):
    answer = 0
    
    d = dict(zip(want, number))
    # print(d)
    
    for i in range(len(discount) - 9):
        temp = deepcopy(d)
        for j in range(i, i + 10):
            if discount[j] in temp.keys():
                temp[discount[j]] -= 1
        # print(temp)
        if chk_items(temp):
            answer += 1    
    
    return answer
