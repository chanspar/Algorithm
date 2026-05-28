def solution(s):
    answer = 0
    length = len(s)
    
    s_double = s * 2
    # print(s_double)
    
    for i in range(length):
        # print(s_double[i:i+length])
        if chk_right(s_double[i:i+length]):
            answer += 1
    return answer


def chk_right(s):
    stack = []
    for c in s:
        if stack:
            if c == '}' and stack[-1] == '{':
                stack.pop()
            elif c == ')' and stack[-1] == '(':
                stack.pop()
            elif c == ']' and stack[-1] == '[':
                stack.pop()
            else:
                stack.append(c)
        else:
            stack.append(c)
    # print(stack)
    if stack:
        return False
    return True
    