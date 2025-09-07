import sys
import heapq
input = sys.stdin.readline

n = int(input())
if n == 1:
    print(0)
    sys.exit()

dasom = int(input())
other_candidates = []
for _ in range(n - 1):
    heapq.heappush(other_candidates, -int(input()))

bribes = 0
while dasom <= -other_candidates[0]:
    most_votes = -heapq.heappop(other_candidates)
    dasom += 1
    most_votes -= 1
    bribes += 1

    heapq.heappush(other_candidates, -most_votes)
print(bribes)