# 11655


small_alpha = 'abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz'
big_alpha = 'ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ' 
str = input()

result = []
for c in str:
    if c in small_alpha:
        idx = small_alpha.find(c)
        result.append(small_alpha[idx + 13])
    elif c in big_alpha:
        idx = big_alpha.find(c)
        result.append(big_alpha[idx + 13])
    else:
        result.append(c)

print(''.join(result))
