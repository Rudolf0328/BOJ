count = int(input())
array = []
triangle = []

def dasom(n):
  if n == 0:
    triangle.append(0)
    return 0
  if n == 1:
    triangle.append(1)
    return 1
  triangle.append(int(n*(n+1)/2))
  # return int(n * (1+n) * (2+n) / 6)

i = 1

while True:
  if int(i*(i+1)*(i+2) / 6) > 300000:
    break
  dasom(i)
  array.append(int(i*(i+1)*(i+2) / 6))
  i += 1

print(triangle)

# print(array)
answer = 0
result = []

for i in range(1, count+1):
  if i in array:
    result.append(1)
  else:
    result.append(399999)

# print(result)

for i in range(1, len(triangle) + 1):
  # if result[i-1] == 1:
  #   continue
  for j in range(triangle[i-1], count+1):
    result[j-1] = min(result[j-1], result[j-triangle[i]] + 1)


print(result)
print(result[count-1])


  # 1 3  6 10 15 21 28 ... n : 1 + 2 + 3 + ... + n
  # 1 4 10 20 35 56 84 ... n : f(1) + f(2) + f(3) + ... + f(n)
