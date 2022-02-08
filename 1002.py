import math

case = int(input())

for i in range (0, case):
    x1, y1, r1, x2, y2, r2 = input().split()
    x1 = int(x1)
    y1 = int(y1)
    r1 = int(r1)
    x2 = int(x2)
    y2 = int(y2)
    r2 = int(r2)

    dist = math.sqrt(math.pow((x2 - x1), 2) + math.pow((y2 - y1), 2))
   # dist = int(dist)

    print(dist, r1+r2)

    if dist > (r1 + r2):
        print(0)
    elif dist < (r1 + r2):
        print(2)
    elif dist == (r1 + r2):
        print(1)
