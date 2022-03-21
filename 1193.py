x = int(input())
temp = 0

for i in range(1, x+1):
  temp += i
  if temp >= x:
    col = i
    row = i - (temp - x)
    break

print(col, row)

if col % 2 == 0:
  bunmo = col
  bunja = 1

  print(bunja, bunmo)

  for i in range(row-1):
    bunmo -= 1
    bunja += 1
    print(bunja, bunmo)

  print(str(bunja) + '/' + str(bunmo))

else:
  bunmo = 1
  bunja = col

  print(bunja, bunmo)

  for i in range(row-1):
    bunmo += 1
    bunja -= 1
    print(bunja, bunmo)

  print(str(bunja) + '/' + str(bunmo))


