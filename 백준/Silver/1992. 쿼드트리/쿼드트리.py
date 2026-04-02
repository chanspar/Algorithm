import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def quad(y, x, size):
    if size == 1:
        return mp[y][x]
    
    first = mp[y][x]
    same = True
    for i in range(y, y+size):
        for j in range(x, x+size):
            if mp[i][j] != first:
                same = False
                break
    
    if same:
        return first
    
    half = size // 2
    return (
        '('
        + quad(y, x, half)
        + quad(y, x + half, half)
        + quad(y + half, x, half)
        + quad(y + half, x + half, half)
        + ')'
    )

n = int(input())
mp = [list(input().rstrip()) for _ in range(n)]

print(quad(0, 0, n))
