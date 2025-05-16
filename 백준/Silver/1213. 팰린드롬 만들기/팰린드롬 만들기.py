s = input()
mp = {}
for c in s:
    mp[c] = mp.get(c, 0) + 1

odd_count = 0
center = ''
left = ''

for k in sorted(mp.keys()):
    if mp[k] % 2 == 1:
        odd_count += 1
        center = k
    left += k * (mp[k] // 2)

if odd_count > 1:
    print("I'm Sorry Hansoo")
else:
    print(left + center + left[::-1])
