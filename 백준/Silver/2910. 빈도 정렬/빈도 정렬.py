import sys
from collections import OrderedDict
input = sys.stdin.readline

dic = OrderedDict()
n,c=map(int, input().split(' '))
for i in input().rstrip('\n').split(' '):
    dic[i] = dic.get(i, 0) + 1

# print(dic)

for k, v in sorted(dic.items(), key=lambda x: x[1], reverse=True):
    for _ in range(v):
        print(k, end = ' ')
