def count_leaves(node):
    # 이 노드가 삭제 대상이면, 리프가 아님
    if node == rm:
        return 0

    # 자식 노드 중 삭제된 노드는 건너뛰고, 리프 개수 합산
    leaf_count = 0
    has_child = False
    for child in adj[node]:
        if child == rm:
            continue
        has_child = True
        leaf_count += count_leaves(child)

    # 만약 자식이 하나도 없으면(=리프 노드면), 1을 반환
    if not has_child:
        return 1
    return leaf_count

import sys
sys.setrecursionlimit(10 ** 6)

n = int(input())
adj = [[] for _ in range(52)]

for i, v in enumerate(list(map(int, input().split()))):
    if v != -1:
        adj[v].append(i)
    else:
        root = i

rm = int(input())

if rm == root:
    print(0)
else:
    print(count_leaves(root))
