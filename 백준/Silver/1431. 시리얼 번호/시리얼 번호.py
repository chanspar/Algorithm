n = int(input())
li = [input().strip() for _ in range(n)]

def key_func(s):
    length = len(s)
    digit_sum = sum(int(ch) for ch in s if ch.isdigit())
    return (length, digit_sum, s)

li.sort(key=key_func)

for item in li:
    print(item)
