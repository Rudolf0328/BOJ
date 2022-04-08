n, m = input().split()

n = int(n)
m = int(m)

answer = [1 for i in range(1000001)]

answer[0] = 0
answer[1] = 0

i = 2
while i*i <= m:
  if answer[i] == 1:
    j = i * 2
    while j <= m:
      answer[j] = 0
      j += i
  i += 1

for i in range(n, m+1):
  if answer[i] == 1:
    print(i)

# 에라토스테네스의 체