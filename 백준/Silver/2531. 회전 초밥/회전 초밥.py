# 1. k개의 접시 연속 먹을 경우 할인된 정액 가격 제공
# 2. 1개의 초밥 종류 쿠폰 발행, 벨트위 없을시 요리사가 제공

# 최소가격으로 최대한 다양한 초밥을 먹는 문제 

# 벨트에 놓인 접시 수 | 초밥 가짓수 | 연속해서 먹는 접시 개수 | 쿠폰 번호
N, d, k, c = map(int, input().split())
arr = []
for _ in range(N):
	arr.append(int(input()))

max_sushi = 0
# 브루투 포스 탐색
for i in range(N):
	sushi_eat = 1
	check_sushi = [0] * (d + 1)
	check_sushi[c] = 1

	for j in range(i, i + k):
		sushi = arr[j % N]
		if check_sushi[sushi] == 0:
			check_sushi[sushi] = 1
			sushi_eat += 1
	max_sushi = max(max_sushi, sushi_eat)

print(max_sushi)
