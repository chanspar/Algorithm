def solution(citations):
    citations_sort = sorted(citations, key=lambda x: -x)
    
    for i, v in enumerate(citations_sort):
        if i + 1 > v:
            return i
    return len(citations)