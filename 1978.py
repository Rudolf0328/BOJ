n = int(input())

input_list = list(map(int, input().split()))

result = 0

def isPrime(n):
  isP = 1
  mid = n // 2 + 1
  for i in range(2, mid+1):
    if n % i == 0:
      isP = 0
      break

  return isP

for i in range(n):
  if input_list[i] == 1:
    continue
  elif input_list[i] == 2:
    result += 1
  elif isPrime(input_list[i]) == 1:
    result += 1

print(result)