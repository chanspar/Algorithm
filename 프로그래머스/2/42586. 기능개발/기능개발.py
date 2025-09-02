# progresses는 현재 진행률 [93, 30, 55]이면 93% 30% 55% 진행되었다.
# speeds는 각 작업의 개발 속도이다. [1, 1, 1] 이면 (94 -> 95 -> 96 ...)으로 진행됨
# 앞에 있는 작업이 완료되어야 뒤에 작업도 배포될 수 있다. 
# 각 배포마다 몇개씩 되는지 확인해 보자 
# 리스트의 길이는 100개 이하
    
# 아이디어 각 작업이 끝나는 기간이 있다. 
# 예시를 보면 [7, 3, 9] 여기서 얻을 수 있는 아이디어 
# 내 기준 보다 같거나 짧은거 반복문 돌려서 카운트하면 됨. 

from collections import deque

def solution(progresses, speeds):
    answer = []
    
    # 각 작업 기간 계산 (100 - progress) // speed, 나머지 있을 시 +1 추가
    end_periods = deque()
    for i in range(len(progresses)):
        period = (100 - progresses[i]) // speeds[i] 
        if (100 - progresses[i]) % speeds[i] > 0:
            period += 1
        end_periods.append(period)
    # print(end_periods)
    
    while end_periods: # 100 * 100
        cnt = 1
        a = end_periods.popleft()
        while end_periods and a >= end_periods[0]:
            end_periods.popleft()
            cnt += 1
        answer.append(cnt)
    
    return answer
