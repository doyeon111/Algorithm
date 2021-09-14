N,K = map(int, input().split())

Ai = [] # 동전의 가치 저장할 리스트 선언
count = 0 # 동전의 개수를 저장할 변수

"""
동전의 가치 리스트의 인덱스 변수
문제에서 동전의 가치 리스트는 오름차순으로 주어진다고 하였으니 
가장 큰 값은 배열의 맨뒤에 저장되어 N-1을 저장한다.
"""
i = N-1

for _ in range(N):
  Ai.append(int(input()))

while K != 0:
  count += K//Ai[i] # 동전의 개수를 저장
  K %= Ai[i] # 동전의 가치로 나눈 나머지를 저장
  i -= 1 # 인덱스를 감소시킨다.

print(count)
