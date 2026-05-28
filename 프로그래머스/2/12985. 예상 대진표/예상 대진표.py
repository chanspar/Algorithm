'''
토너먼트 a,b는 언제 만날까?
   
       
   4       7
 1   4   5   7   
1 2 3 4 5 6 7 8 

2 ^ 20 = 백만정도군


'''

def solution(n,a,b):
    answer = 0
    _round = 1
    li = [i for i in range(1, n+1)]
    flag = 0
    
    while flag == 0:
        temp = li
        li = []
        for i in range(0, len(temp), 2):
            if temp[i] == a and temp[i+1] == b:
                answer = _round
                flag = 1
                break
            elif temp[i] == b and temp[i+1] == a:
                answer = _round
                flag = 1
                break
            elif temp[i] == a or temp[i+1] == a:
                li.append(a)
            elif temp[i] == b or temp[i+1] == b:
                li.append(b)
            else:
                li.append(temp[i])
        _round += 1

    return answer
