vow = ['A', 'E', 'I', 'O', 'U']
words = []

def dfs(s):
    words.append("".join(s))
    if len(s) == 5:
        return
    
    for a in vow:
        s.append(a)
        dfs(s)
        s.pop()
    

def solution(word):
    answer = 0
    temp = list()
    dfs(temp)
    # print(words)
    answer = words.index(word)
    
    
    
    return answer