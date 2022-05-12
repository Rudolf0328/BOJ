inputs = []
results = []
inputNum = int(input())

while inputNum != 0:
  inputs.append(inputNum)
  inputNum = int(input())

maxNum = max(inputs) * 2 + 1

primes = [1 for i in range(maxNum)]

primes[0] = 0
primes[1] = 0

i = 2

while i*i <= maxNum - 1:
  if primes[i] == 1:
    j = i * 2
    while j <= maxNum - 1:
      primes[j] = 0
      j += i
  i += 1


for i in range(len(inputs)):
  count = 0
  for j in range(inputs[i] + 1, inputs[i] * 2 + 1):
    if primes[j]  == 1:
      count += 1
  results.append(count)

for i in range(len(results)):
  print(results[i])