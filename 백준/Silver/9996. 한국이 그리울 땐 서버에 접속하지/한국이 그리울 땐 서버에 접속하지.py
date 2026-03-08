# 9996
import sys

input = sys.stdin.readline

n = int(input())

quiz = input().rstrip()
star_idx = quiz.find('*')
front = quiz[:star_idx]
back = quiz[star_idx + 1:]

result = []
for i in range(n):
    answer = input().rstrip()
    if not answer.startswith(front):
        result.append("NE")
    elif not answer[len(front):].endswith(back):
        result.append("NE")
    else:
        result.append("DA")

print('\n'.join(result))
