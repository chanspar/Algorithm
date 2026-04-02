'''
집: 1, 2 ,3 ,4 ,5 ... n개 가 있고
조건:
n번집이랑 != n-1번집 색깔
!= i-1번집 i번집 != i+1번집

테이블을 정의합시다.
d[i][0], d[i][1], d[i][2] -> 이거는 집이 빨파초일 상황
d[i][0] = min(d[i-1][1], d[i-1][2]) + s[i][0]
d[i][1] = min(d[i-1][0], d[i-1][2]) + s[i][1]
d[i][2] = min(d[i-1][0], d[i-1][1]) + s[i][2]
'''
import sys

input = sys.stdin.readline

n = int(input())
d = [[0] * 3 for _ in range(n)]
s = [list(map(int, input().split())) for _ in range(n)]

d[0][0] = s[0][0]
d[0][1] = s[0][1]
d[0][2] = s[0][2]

for i in range(n):
    d[i][0] = min(d[i-1][1], d[i-1][2]) + s[i][0]
    d[i][1] = min(d[i-1][0], d[i-1][2]) + s[i][1]
    d[i][2] = min(d[i-1][0], d[i-1][1]) + s[i][2]

print(min(d[n-1][2], min(d[n-1][0], d[n-1][1])))
