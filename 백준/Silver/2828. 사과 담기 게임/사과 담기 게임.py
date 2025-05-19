n,m = map(int, input().split(' '))

s = 1
e = m 

j = int(input())

ret = 0
for i in range(j):
    p = int(input())
    if s <= p and p <= e:
        continue
    elif e < p:
        dif = p - e
        ret += dif
        s += dif
        e += dif  
    else:
        dif = s - p
        ret += dif
        s -= dif
        e -= dif

print(ret)
