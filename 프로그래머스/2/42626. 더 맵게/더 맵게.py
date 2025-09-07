# 정렬 시 nlogn (n < 10,000)
# 힙 logn (n 거의 무한)
import heapq

def solution(scoville, K):
    answer = 0
    scovs = scoville.copy()
    heapq.heapify(scovs)
    
    while scovs[0] < K:
        if len(scovs) < 2:
            return -1
        
        a = heapq.heappop(scovs)
        b = heapq.heappop(scovs)
        mix = a + (b * 2)
        answer += 1
        heapq.heappush(scovs, mix)
    
    return answer
