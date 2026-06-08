from collections import deque

def solution(numbers):
    answer = []
    
    q = deque()
    reverse_numbs = reversed(numbers)
        
    for i in reverse_numbs:
        if not q:
            answer.append(-1)
            q.append(i)
        elif q:
            while q and i >= q[0]:
                q.popleft()
            if not q:
                answer.append(-1)
                q.append(i)
            else:
                answer.append(q[0])
                q.appendleft(i)    
    answer = list(reversed(answer))
    return answer