"""Program currently sums up primes to 20,000"""
def primecheck(i,list):
  for x in range(0,len(list)):
    if(i%list[x]==0):
      return False
  return True
primeList = [2]

sum = 2
""" insert range of numbers to generate to"""
for i in range(3,20000):
  if primecheck(i,primeList):
    primeList.append(i)
    sum = sum + i
print sum
