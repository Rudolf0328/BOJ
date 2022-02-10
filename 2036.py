count = int(input())
arrayMinus = []
arrayPlus = []
total = 0

for i in range(0, count):
  inputNumber = int(input())
  if inputNumber == 1:
    total = total + 1
  else:
    if inputNumber > 0:
      arrayPlus.append(inputNumber)
    else:
      arrayMinus.append(inputNumber)

arrayMinus.sort()
arrayPlus.sort(reverse = True)

for i in range(int(len(arrayMinus) / 2)):
  total += arrayMinus[i*2] * arrayMinus[i*2+1]
  
if len(arrayMinus) % 2 == 1:
  total += arrayMinus[len(arrayMinus) - 1]

for i in range(int(len(arrayPlus)/2)):
  total += arrayPlus[i*2] * arrayPlus[i*2+1]

if len(arrayPlus) % 2 == 1:
  total += arrayPlus[len(arrayPlus) - 1]

print(total)