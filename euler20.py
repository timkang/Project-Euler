#Find the sum of the digits of 100!

import math

resu = str(math.factorial(100))
sum = 0

for digit in resu:
  sum += int(digit)

print sum
