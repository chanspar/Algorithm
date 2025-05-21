import sys
input = sys.stdin.readline # 빠른 입력을 위한 설정

m = int(input())

ret = []
for i in range(m):
    s = input().strip()
    temp = ''
    for j in list(s):
        if '0' <= j <= '9':
            temp += j
        else:
            if temp:
                ret.append(int(temp))
                temp = ''
    if temp:
        ret.append(int(temp))
      
# print(ret)

for i in sorted(ret):
    print(i)


