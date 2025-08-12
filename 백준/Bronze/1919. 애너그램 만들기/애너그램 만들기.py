a = input()
b = input()

a_li = [0] * 26
b_li = [0] * 26

for i in a:
    a_li[ord(i) - ord('a')] += 1

for i in b:
    b_li[ord(i) - ord('a')] += 1


res = 0

for i in range(26):
    if a_li[i] != b_li[i]:
        res += abs(a_li[i] - b_li[i])
print(res)