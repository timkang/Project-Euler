#Find the largest palindrome made from the product of two 3-digit numbers

curr_max = 0
for i in range(100,1000):
  for j in range(100,1000):
    if str(i*j) == str(i*j)[::-1] and i*j > curr_max:
      curr_max = i*j
print curr_max
