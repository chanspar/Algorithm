import sys
import heapq

input = sys.stdin.readline

n = int(input())

if n == 0:
    print(0)
    sys.exit()

arr = [list(map(int, input().split())) for _ in range(n)]

arr.sort(key=lambda x: x[1], reverse=True)

result = 0
max_heap = []
current_day = arr[0][1]
idx = 0

for day in range(current_day, 0, -1):
    while idx < n and arr[idx][1] >= day:
        heapq.heappush(max_heap, -arr[idx][0])
        idx += 1
    
    if max_heap:
        result += -heapq.heappop(max_heap)

print(result)
