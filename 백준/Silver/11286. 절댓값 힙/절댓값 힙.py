import heapq
import sys

input = sys.stdin.readline
n = int(input())
hq = []

for _ in range(n):
    num = int(input())
    
    if num == 0:
        if not hq:
            print('0')
        else:
            print(heapq.heappop(hq)[1])
    else:
        heapq.heappush(hq, (abs(num), num))
