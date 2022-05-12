maximum = 10000

n = int(input())
inputs = []

for i in range(n):
  inputs.append(int(input()))

primes = [1 for i in range(10001)]

primes[0] = 0
primes[1] = 0

i = 2

while i*i <= maximum:
  if primes[i] == 1:
    j = i * 2
    while j <= maximum:
      primes[j] = 0
      j += i
  i += 1

for i in range(len(inputs)):
  current = inputs[i]
  for j in range(2, current // 2 + 1):
    if primes[j] == 1 and primes[current - j] == 1:
      a = j
      b = inputs[i] - j
  print(a, b)