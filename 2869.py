a, b, v = input().split()
v = int(v)
a = int(a)
b = int(b)

diff = a - b
if (v-a) % diff == 0:
  print(int((v-a) / diff + 1))
else:
  print(int((v - a)/diff) + 2)
