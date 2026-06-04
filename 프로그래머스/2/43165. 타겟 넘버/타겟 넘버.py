def dfs(idx, sums, numbers, target):
    
    if idx == len(numbers):
        return 1 if sums == target else 0
    
    
    left = dfs(idx + 1, sums + numbers[idx], numbers, target)
    right = dfs(idx + 1, sums - numbers[idx], numbers, target)
    
    return left + right

def solution(numbers, target):
    return dfs(0, 0, numbers, target)