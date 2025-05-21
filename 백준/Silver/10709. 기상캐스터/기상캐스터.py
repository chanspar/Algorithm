import sys
input = sys.stdin.readline

h, w = map(int, input().split(' '))

for _ in range(h):
    s = input().rstrip()
    p = -1
    # li = []
    for j in list(s):
        if j == 'c':
            p = 0
        elif p >= 0:
            p += 1
        # li.append(p)
        print(p, end = ' ')

    print()

    




    
