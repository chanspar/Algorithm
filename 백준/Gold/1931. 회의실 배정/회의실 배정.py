# 1. 입력 받기
n = int(input())
meetings = []

for _ in range(n):
    start, end = map(int, input().split())
    meetings.append((start, end))

# 2. 정렬하기
# 끝나는 시간(x[1])을 기준으로 먼저 정렬하고, 
# 끝나는 시간이 같다면 시작 시간(x[0])을 기준으로 정렬합니다.
meetings.sort(key=lambda x: (x[1], x[0]))

# 3. 겹치지 않게 선택하기
count = 0
last_end_time = 0

for start, end in meetings:
    # 현재 회의 시작 시간이 이전 회의가 끝난 시간보다 같거나 크다면 선택!
    if start >= last_end_time:
        count += 1
        last_end_time = end

# 4. 결과 출력
print(count)