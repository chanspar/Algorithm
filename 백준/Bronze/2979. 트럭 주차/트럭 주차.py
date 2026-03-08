# 2979

fee1, fee2, fee3 = map(int, input().split())
# print(fee1, fee2, fee3)

arr = [0 for _ in range(1, 101)]
for i in range(3):
    a, b = map(int, input().split())
    for j in range(a, b):
        arr[j] += 1
    
total_fee = 0
for i in arr:
    if i == 1:
        total_fee += fee1    
    elif i == 2:
        total_fee += fee2 * 2
    elif i == 3:
        total_fee += fee3 * 3

print(total_fee)
