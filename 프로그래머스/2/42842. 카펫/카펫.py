def solution(brown, yellow):
    answer = []
    
    # 24
    # (1, 24), (2, 12), (3, 8), (4, 6) 
    pairs = []
    for i in range(1, int(yellow**0.5) + 1):
        if yellow % i == 0:
            pairs.append((i, int(yellow / i)))
            
    
    for y,x in pairs:
        sum = 0
        sum += y * 2
        sum += (x + 2) * 2
        if sum == brown:
            answer = [x + 2, y + 2]
            break
        
    return answer