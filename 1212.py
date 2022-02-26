eight = input()
two = ''

def eight2Two(digit, isFirst):
  result = ''
  while digit > 0:
    result = str(digit % 2) + result
    digit = int(digit/2)
  
  while not isFirst and len(result) < 3:
    result = '0' + result
  return result

if eight == '0':
  print('0')
else:
  two += eight2Two(int(eight[0]), True)
  eight = eight[1:]
  for i in eight:
    two += eight2Two(int(i), False)
  print(two)