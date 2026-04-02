'''
쿼드트리 
왼위 오위
왼아래 오아래
로 반복 돌리고 
모든 영역이 같을 경우 끝내버려 
'''

# 초기 세팅 & 데이터 
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def quad(y, x, size):
    if size == 1:
        return a[y][x]
    
    # 영역 균일성 체크
    first = a[y][x]
    same = True
    for i in range(y, y+size):
        if not same:
            break
        for j in range(x, x+size):
            if a[i][j] != first:
                same = False
                break
    
    if same:
        return first
    
    # 4분할 재귀 처리
    half = size // 2
    return (
        '(' 
        + quad(y, x, half) 
        + quad(y, x+half, half) 
        + quad(y+half, x, half) 
        + quad(y+half, x+half, half) 
        + ')'
    )

n = int(input())
a = [list(input().rstrip('\n')) for _ in range(n)]

print(quad(0, 0, n))
