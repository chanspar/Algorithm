from itertools import permutations

def solution(k, dungeons):
    answer = -1
    
    for a in permutations(range(len(dungeons))):
        cnt = 0
        health = k
        for i in a:
            if dungeons[i][0] <= health:
                cnt += 1
                health -= dungeons[i][1]
        answer = max(answer, cnt)
    
    return answer