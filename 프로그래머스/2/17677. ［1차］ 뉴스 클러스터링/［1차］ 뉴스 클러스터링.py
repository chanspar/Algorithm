import math

def solution(str1, str2):
    answer = 0
    s1 = []
    s2 = []
    for i in range(0, len(str1)-1):
        c = str1[i:i+2]
        if c.isalpha():
            s1.append(c.lower())
    # print(s1)
    for i in range(0, len(str2)-1):
        c = str2[i:i+2]
        if c.isalpha():
            s2.append(c.lower())
    # print(s2)
        
    intersects = 0
    save_s2 = len(s2)
    for i in s1:
        if i in s2:
            intersects += 1
            s2.remove(i)
    unions = len(s1) + save_s2 - intersects
    
    if unions == 0:
        return 65536
    else:
        answer = math.floor(intersects / unions * 65536)
        
    
    return answer