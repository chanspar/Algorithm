def solution(numbers):
    answer = 0
    sort_num = sorted(numbers, reverse=True)
    answer = sort_num[0] * sort_num[1]
    
    return answer