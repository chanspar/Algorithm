import math

def mk_nbase(num, k):
    result = ""
    while num != 0:
        result = str(num % k) + result 
        num = num // k
    return result

def chk_prime(num):
    if num == 1:
        return False
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False
    return True

def solution(n, k):
    answer = 0
    n_base = mk_nbase(n, k)
    n_base = n_base.split('0')
    for i in n_base:
        if i.isdigit():
            if chk_prime(int(i)):
                answer += 1

    return answer