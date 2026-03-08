# 10808
import sys
from collections import Counter 

input = sys.stdin.readline

str = input().rstrip()
cnt = Counter(str)
result = [0 for _ in range(26)]

for key, value in cnt.items():
    # print(key, value)
    result[ord(key) - 97] = value

print(*result)
