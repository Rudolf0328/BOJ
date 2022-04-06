m = int(input())
n = int(input())

num = n - m + 1

total = 0
minPrime = 0

def isPrime(n):
  isP = 1
  mid = n // 2 + 1
  for i in range(2, mid+1):
    if n % i == 0:
      isP = 0
      break

  return isP

for i in range(num):
  if m+i == 1:
    continue
  elif m+i == 2 or isPrime(m+i) == 1:
    total += m+i
    if minPrime == 0:
      minPrime = m+i

if total == 0:
  print(-1)
else:
  print(total)
  print(minPrime)
