t = int(input())

for i in range(t):
  # k층 n호
  k = int(input())
  n = int(input())

  under = [i for i in range(1, n+1)]
  current = under[:]
  people = 0

  for i in range(k):
    people = 0
    for j in range(n):
      people += under[j]
      current[j] = people
    under = current[:]

  print(current[n-1])