import sys
input = sys.stdin.readline

vowels = ['a', 'e', 'i', 'o', 'u']

while True:
    r1, r2, r3 =0, 0, 0
    s = input().rstrip('\n')
    # print(s)
    if s == 'end':
        break
    
    for v in vowels:
        if v in s:
            r1 += 1
    
    if r1 == 0:
        print(f'<{s}> is not acceptable.')
        continue

    for i in range(len(s) - 2):
        if s[i] in vowels and s[i + 1] in vowels and s[i + 2] in vowels:
            r2 += 1
        if s[i] not in vowels and s[i + 1] not in vowels and s[i + 2] not in vowels:
            r2 += 1
    if r2 > 0:
        print(f'<{s}> is not acceptable.')
        continue

    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            if s[i] != 'e' and s[i] != 'o':
                r3 += 1
    if r3 > 0:
        print(f'<{s}> is not acceptable.')
        continue
    print(f'<{s}> is acceptable.')
