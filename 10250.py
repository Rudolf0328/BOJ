t = int(input())

for i in range(t):
  h, w, n = input().split()
  h = int(h)
  w = int(w)
  n = int(n)

  if n % h == 0:
    y = h
    x = n // h
  else:
    y = n % h
    x = n // h + 1
  
  if x < 10:
    x = '0' + str(x)

  print(str(y) + str(x))