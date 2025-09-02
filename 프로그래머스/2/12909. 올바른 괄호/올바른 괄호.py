def solution(s):
    answer = True
    li = []
    
    for i in s:
        if i == '(':
            li.append(i)
        elif i == ')' and not li:
            return False
        else:
            li.pop()
    if li:
        return False
                     
    return True
